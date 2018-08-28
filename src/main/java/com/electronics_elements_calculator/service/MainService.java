package com.electronics_elements_calculator.service;

import com.electronics_elements_calculator.model.Resistor;

public class MainService {

    public static void main(String[] args) {

            Resistor resistor1 = new Resistor(34523523L, "żółty","czarny", "czarny", "czerwony");
            ResistorService resistorService = new ResistorService();

            System.out.println(resistorService.resistanceOfTheResistor(resistor1));
            System.out.println(resistorService.toleranceOfTheResistor(resistor1));

            resistorService.createResistor(new Resistor("czarny","czarny", "czarny", "czerwony"));


    }
}
