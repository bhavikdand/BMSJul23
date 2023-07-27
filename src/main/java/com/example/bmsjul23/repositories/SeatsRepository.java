package com.example.bmsjul23.repositories;

import com.example.bmsjul23.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatsRepository extends JpaRepository<Seat, Integer> {

//    List<Seat> findAllById(List<Integer> seatIds);

    @Override
    List<Seat> findAllById(Iterable<Integer> integers);
}
