package com.example.testjob.mvc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int kmCounter;
    public boolean isEngineExpired() {
        return false;
    }
    public void plusToTheTotalMileage(int n){
        kmCounter += n;
    }
}
