package com.example.bmsjul23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    private SeatStatus status;
}
