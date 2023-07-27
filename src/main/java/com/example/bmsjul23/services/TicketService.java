package com.example.bmsjul23.services;

import com.example.bmsjul23.models.*;
import com.example.bmsjul23.repositories.SeatsRepository;
import com.example.bmsjul23.repositories.ShowRepository;
import com.example.bmsjul23.repositories.ShowSeatRepository;
import com.example.bmsjul23.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;

    private SeatsRepository seatsRepository;
    private TicketRepository ticketRepository;

    @Autowired
    public TicketService(ShowRepository showRepository, ShowSeatRepository showSeatRepository, SeatsRepository seatsRepository, TicketRepository ticketRepository) {
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.seatsRepository = seatsRepository;
        this.ticketRepository = ticketRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket bookTicket(int showId, List<Integer> seatIds, int userId) throws Exception{

//        Optional<Show> showOptional = showRepository.findById(showId);
//
//        if(showOptional.isEmpty()){
//            //TODO throw custom exception
//            throw new Exception("Show doesnt exists");
//        }
//        Show show = showOptional.get();
//
//        List<Seat> seats = seatsRepository.findAllByIds(seatIds);
//
//        if(seats.size() != seatIds.size()){
//            throw new Exception("Invalid seats");
//        }
//
//        List<ShowSeat> showSeats =
//                showSeatRepository.findAllBySeatInAndShow(show, seats);
//
//        for (ShowSeat showSeat : showSeats) {
//            if(!showSeat.getStatus().equals(SeatStatus.AVAILABLE)){
//                throw new Exception("Seat " + showSeat.getId() + "is not available");
//            }
//        }
//
//        // Update seat status - Assignment figure out how to update show seats via JPA
//
//        Ticket ticket = new Ticket();
//        ticket.setSeats(seats);
//        ticket.setShow(show);
//        ticket.setTimeOfBooking(new Date());
//        //Persist ticket in db
//        return ticketRepository.save(ticket);
        return null;
    }
}
