package com.example.bmsjul23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Entity
public class Theatre extends BaseModel{

//    @Getter
//    @Setter
    private String name;

    private String address;

    @OneToMany
    private List<Screen> screens;

}
