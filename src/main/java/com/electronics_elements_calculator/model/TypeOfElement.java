package com.electronics_elements_calculator.model;

public enum TypeOfElement {

    RESISTOR("Opornik"),
    CAPACITOR("Kondensator");






    private String description;

    TypeOfElement(String opornik) {
        opornik = description;
    }

    public String getDescription() {
        return description;
    }
}
