package com.example.pockerplanning.Dto;

import java.time.LocalDateTime;

public class SessionDTO {
    private int id;
    private LocalDateTime startDate;
    private LocalDateTime Enddate ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEnddate() {
        return Enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        Enddate = enddate;
    }
}
