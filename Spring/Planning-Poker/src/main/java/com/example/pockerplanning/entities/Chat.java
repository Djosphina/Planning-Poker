package com.example.pockerplanning.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Chat")
public class Chat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "isActive")
    private Boolean isActive;

    @ManyToOne
    private Session sessionC;
/*
    @OneToMany(cascade = CascadeType.ALL, mappedBy="chat")
    private List<Message> messages;
*/
}
