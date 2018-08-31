package com.electronics_elements_calculator.model;

public enum ResistorStrapsColors {

    CZARNY("czarny"),
    NIEBIESKI("niebieski"),
    ZIELONY("zielony"),
    BIALY("biały"),
    SZARY("szary"),
    ZOLTY("żółty"),
    BRAZOWY("brązowy"),
    CZERWONY("czerwony"),
    POMARANCZOWY("pomarańczowy"),
    FIOLETOWY("fioletowy");

    private String description;

    ResistorStrapsColors(String desc) {
        desc = description;
    }

    public String getDesc() {
        return description;
    }
}
