package com.example.bmsjul23.dtos;

import lombok.Data;

import java.util.List;

@Data
public class BookTicketRequestDTO {
    private int showId;
    private List<Integer> seatIds;
    private int userId;
}
