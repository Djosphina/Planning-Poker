package com.example.pockerplanning.controller;

import com.example.pockerplanning.entities.Session;
import com.example.pockerplanning.services.impl.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/session")
@CrossOrigin("*")
public class SessionController {
    @Autowired
    private SessionService sessionService ;

    @PostMapping("/AddSession")
    public ResponseEntity<?> addSession(@RequestBody Session session) {
        try {
            return sessionService.addSession2(session);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create session: " + e.getMessage());
        }
    }

    @PutMapping("/UpdateSession/{idsession}")
    public ResponseEntity<?> UpdateSession(@PathVariable Long idsession) {
        try {
            return sessionService.updateSession(idsession);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update session: " + e.getMessage());
        }
    }
    @GetMapping("/remaining-time/{id}")
    public ResponseEntity<?> getRemainingTimeForSession(@PathVariable Long id) {
        try {
            String remainingTime = sessionService.getRemainingTimeForSession(id);
            String[] parts = remainingTime.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);

            Map<String, Integer> remainingTimeMap = new HashMap<>();
            remainingTimeMap.put("hours", hours);
            remainingTimeMap.put("minutes", minutes);
            remainingTimeMap.put("seconds", seconds);

            return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(remainingTimeMap);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }
}
