package com.electronics_elements_calculator.model;


import lombok.Data;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Service
public class Resistor {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ResistorStrapsColors strap1;
    private ResistorStrapsColors strap2;
    private ResistorStrapsColors multiplier;
    private ResistorStrapsColors tolerance;


    public Resistor() {
    }

    public Resistor(Long id, ResistorStrapsColors strap1, ResistorStrapsColors strap2,
                    ResistorStrapsColors multiplier,ResistorStrapsColors tolerance) {
        this.strap1 = strap1;
        this.strap2 = strap2;
        this.multiplier = multiplier;
        this.tolerance = tolerance;
        this.id = id;
    }

    public Resistor(ResistorStrapsColors strap1, ResistorStrapsColors strap2,
                    ResistorStrapsColors multiplier, ResistorStrapsColors tolerance) {
        this.strap1 = strap1;
        this.strap2 = strap2;
        this.multiplier = multiplier;
        this.tolerance = tolerance;
    }
}
