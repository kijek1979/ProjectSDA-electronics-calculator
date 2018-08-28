package com.electronics_elements_calculator.controller;


import com.electronics_elements_calculator.model.Resistor;
import com.electronics_elements_calculator.service.ResistorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/resistors")
public class ResistorController {

    @Autowired
    private ResistorService resistorService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Resistor create(@RequestBody @Valid Resistor resistor){
        return resistorService.createResistor(resistor);
    }
}
