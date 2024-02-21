package com.example.pockerplanning.services.impl;

import com.example.pockerplanning.entities.Session;
import com.example.pockerplanning.repository.SessionRepositery;
import com.example.pockerplanning.services.Interface.ISessionService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

@Service
public class SessionService implements ISessionService {
    @Autowired
    private SessionRepositery sessionRepository ;
    @Autowired
    private JavaMailSender javaMailSender;



   /* @Override
    public ResponseEntity<?> addSession2(Session session) {
        try {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime sessionStartDate = now.plus(30, ChronoUnit.MINUTES);
            session.setStartDate(sessionStartDate);

            Session createdSession = sessionRepository.save(session);
           this.sendSessionAddedEmail(session);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdSession);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create session: " + e.getMessage());
        }
    }*/

    @Override
    public ResponseEntity<?> addSession2(Session session) {
        try {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime sessionStartDate = now.plus(30, ChronoUnit.MINUTES);
            session.setStartDate(sessionStartDate);

            Session createdSession = sessionRepository.save(session);
            this.sendSessionAddedEmail(session);

            // Envoyer un message WebSocket pour notifier les autres clients


            return ResponseEntity.status(HttpStatus.CREATED).body(createdSession);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create session: " + e.getMessage());
        }
    }

    public ResponseEntity<?> updateSession( Long id) {
        Session session = sessionRepository.findById(id).orElse(null);

        if (session != null) {
            try {
                session.setEnddate(LocalDateTime.now());
                sessionRepository.saveAndFlush(session);
                return ResponseEntity.ok(session);
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("Failed to update session: " + e.getMessage());
            }
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Session not found with id: " + id);
        }
    }
  /*  public void sendSessionAddedEmail(Session session) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
      simpleMailMessage.setFrom("pokerplaning0@gmail.com");
        String[] recipients = { "wiem.khedri50@gmail.com", "mejdoub.hana18@gmail.com" };
        simpleMailMessage.setSubject("New Session Added");
        simpleMailMessage.setTo(recipients);
        simpleMailMessage.setText("A new session has been added.\n\n"
                        + "We Have A New Session after 30 Minute:\n"
                // Add more session details as needed
        );
        javaMailSender.send(simpleMailMessage);
    }*/



    public void sendSessionAddedEmail(Session session) {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper;
        try {
            helper = new MimeMessageHelper(message, true);
            helper.setFrom(new InternetAddress("pokerplaning0@gmail.com"));
            String[] recipients = { "wiem.khedri50@gmail.com"};
            helper.setTo(recipients);
            helper.setSubject("New Session Added");

            String yesButton = "<button type='button' style='background-color: green; color: white; padding: 10px 20px;' "
                    + "onclick=\"sendResponse('yes', '" + session.getId() + "', '" + "');\">Yes</button>";

            String noButton = "<button type='button' style='background-color: red; color: white; padding: 10px 20px;' "
                    + "onclick=\"sendResponse('no', '" + session.getId() + "', '"+ "');\">No</button>";


            String htmlContent = "<p>A new session has been added.</p>"
                    + "<p>We Have A New Session after 30 Minute:</p>"
                    + "<p>Please confirm your presence:</p>"
                    + yesButton + noButton ;

            helper.setText(htmlContent, true);

            javaMailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public String getRemainingTimeForSession(Long id) {
        Optional<Session> optionalSession = sessionRepository.findById(id);
        if (optionalSession.isPresent()) {
            Session session = optionalSession.get();
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime sessionStartDate = session.getStartDate();
            if (sessionStartDate.isAfter(now)) {
                Duration duration = Duration.between(now, sessionStartDate);
                long seconds = duration.getSeconds();
                long absSeconds = Math.abs(seconds);
                long hours = absSeconds / 3600;
                long minutes = (absSeconds % 3600) / 60;
                long secs = absSeconds % 60;

                return String.format("%02d:%02d:%02d", hours, minutes, secs);
            } else {
                return "00:00:00";
            }
        } else {
            return "Session not found";
        }
    }

}

