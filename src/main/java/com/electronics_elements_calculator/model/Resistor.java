package com.electronics_elements_calculator.model;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
public class Resistor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String strap1;
    private String strap2;
    private String multiplier;
    private String tolerance;

    public Resistor() {
    }

    public Resistor(Long id, String strap1, String strap2, String multiplier, String tolerance) {
        this.strap1 = strap1;
        this.strap2 = strap2;
        this.multiplier = multiplier;
        this.tolerance = tolerance;
        this.id = id;
    }

    public Resistor(String strap1, String strap2, String multiplier, String tolerance) {
        this.strap1 = strap1;
        this.strap2 = strap2;
        this.multiplier = multiplier;
        this.tolerance = tolerance;
    }
}
