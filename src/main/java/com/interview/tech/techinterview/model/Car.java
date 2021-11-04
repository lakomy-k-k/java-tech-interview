package com.interview.tech.techinterview.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class Car {
    private String brand;
    private LocalDate dateOfProduction;
    private String price;
}
