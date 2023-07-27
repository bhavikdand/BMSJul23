package com.example.bmsjul23.dtos;

import com.example.bmsjul23.models.Ticket;
import lombok.Data;

@Data
public class BookTicketResponseDTO {
    private Response response;
    private Ticket ticket;

    public static BookTicketResponseDTO getFailureDTO(String message){
        BookTicketResponseDTO responseDTO = new BookTicketResponseDTO();
        Response response = new Response();
        response.setStatus(ResponseStatus.FAILURE);
        response.setMessage(message);
        responseDTO.setResponse(response);
        return responseDTO;
    }

    public static BookTicketResponseDTO getSuccessDTO(Ticket ticket){
        BookTicketResponseDTO responseDTO = new BookTicketResponseDTO();
        Response response = new Response();
        response.setStatus(ResponseStatus.SUCCESS);
        response.setMessage("Ticket created successfully");
        responseDTO.setResponse(response);
        responseDTO.setTicket(ticket);
        return responseDTO;
    }
}
