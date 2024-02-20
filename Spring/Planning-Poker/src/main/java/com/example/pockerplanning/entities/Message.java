package com.example.pockerplanning.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Message")
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

   /* @Column(name = "description")
    private String description;
*/
    private String content;

    private String sender;

    @Column(name = "dateTime")
    private Date dateTime;
/*
    @ManyToOne
    private Chat chat;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "message")
    private List<Metric> metrics;
*/
}
