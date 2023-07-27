package com.example.bmsjul23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Ticket extends BaseModel{

    @ManyToOne
    private Show show;

    @OneToMany
    List<Seat> seats;
    private Date timeOfBooking;
}
