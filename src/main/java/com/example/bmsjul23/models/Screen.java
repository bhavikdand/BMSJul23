package com.example.bmsjul23.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Screen extends BaseModel{
    private String name;
    @OneToMany(mappedBy = "screen")
    private List<Seat> seats;

    private ScreenStatus status;
    @ElementCollection
    @Enumerated(value = EnumType.ORDINAL)
    private List<Feature> features;

    @ManyToOne
    private Theatre theatre;
}
