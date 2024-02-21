package com.example.pockerplanning.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "Ticket")
public class Ticket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idticket")
    private Long Id;

    private String self;
    private String key;
    @ManyToOne
    Sprint sprint;
    @Embedded
    private Fields fields;

    // Getter and setter for fields
    /*public Fields getFields() {
        return fields;
    }*/

   /* public void setFields(Fields fields) {
        this.fields = fields;
    }
*/
    @Embeddable
    @Data
    public static class Fields {
        private String summary;
        private String description;
        @Embedded
        private Priority priority;
        @Embedded
        private Status status;
        @Embedded
        private Assignee assignee;
        @Embedded
        private Reporter reporter;
        private String created;
        private String updated;
    }

    @Embeddable
    @Data
    public static class Priority {
        @Column(name = "priority_name") // Unique column name for Priority name
        private String name;
    }

    @Embeddable
    @Data
    public static class Status {
        @Column(name = "status_name") // Unique column name for Status name
        private String name;
    }

    @Embeddable
    @Data
    public static class Assignee {
        @Column(name = "assignee_name") // Unique column name for Assignee name
        private String name;
    }

    @Embeddable
    @Data
    public static class Reporter {
        @Column(name = "reporter_name") // Unique column name for Reporter name
        private String name;
    }
    @ManyToOne
    @JoinColumn(name="session_id")
    private Session session ;



    @OneToMany( mappedBy="ticket")
    @JsonIgnore
    private List<Vote> voteList ;





}
