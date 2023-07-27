package com.example.bmsjul23.controllers;

import com.example.bmsjul23.dtos.BookTicketRequestDTO;
import com.example.bmsjul23.dtos.BookTicketResponseDTO;
import com.example.bmsjul23.dtos.Response;
import com.example.bmsjul23.dtos.ResponseStatus;
import com.example.bmsjul23.models.Ticket;
import com.example.bmsjul23.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public BookTicketResponseDTO bookTicket(BookTicketRequestDTO requestDTO){
        Ticket ticket;
        try {
            ticket = ticketService.bookTicket(requestDTO.getShowId(), requestDTO.getSeatIds(), requestDTO.getUserId());
        } catch (Exception e){
            return BookTicketResponseDTO.getFailureDTO(e.getMessage());
        }
        return BookTicketResponseDTO.getSuccessDTO(ticket);
    }
}
