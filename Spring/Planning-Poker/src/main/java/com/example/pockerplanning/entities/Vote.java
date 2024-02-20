package com.example.pockerplanning.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;


    @ManyToOne
    @JoinColumn(name="session_id")
    private Session sessionV ;
}
