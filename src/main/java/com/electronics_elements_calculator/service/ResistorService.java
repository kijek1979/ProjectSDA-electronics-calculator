package com.electronics_elements_calculator.service;


import com.electronics_elements_calculator.model.Resistor;
import com.electronics_elements_calculator.repository.ResistorRepository;
import org.springframework.stereotype.Service;

@Service
public class ResistorService extends ResistorRepository {

    private Integer multiplierValue = 0;
    private Double toleranceValue = 0.0;
    private Integer strap1Value = 0;
    private Integer strap2Value = 0;
    private Resistor resistor = new Resistor();


    @Override
    public Resistor elementAddToList(Object o) {

        resistorList.add((Resistor) o);
        return resistor;
    }

    @Override
    public void elementRemoveFromList(int index) throws ArrayIndexOutOfBoundsException{
        if(index > resistorList.size())
            throw new ArrayIndexOutOfBoundsException("podany indeks nie istnieje");

        resistorList.remove(index);

    }






    public Integer strap1Value(Resistor resistor) {

        switch (resistor.getStrap1()) {
            case CZARNY:
                strap1Value = 0;
                break;
            case NIEBIESKI:
                strap1Value = 6;
                break;
            case ZIELONY:
                strap1Value = 5;
                break;
            case BIALY:
                strap1Value = 9;
                break;
            case SZARY:
                strap1Value = 8;
                break;
            case ZOLTY:
                strap1Value = 4;
                break;
            case BRAZOWY:
                strap1Value = 1;
                break;
            case CZERWONY:
                strap1Value = 2;
                break;
            case POMARANCZOWY:
                strap1Value = 3;
                break;
            case FIOLETOWY:
                strap1Value = 7;
                break;
        }
        return strap1Value;
    }


    public Integer strap2Value(Resistor resistor) {

        switch (resistor.getStrap2()) {
            case CZARNY:
                strap2Value = 0;
                break;
            case NIEBIESKI:
                strap2Value = 6;
                break;
            case ZIELONY:
                strap2Value = 5;
                break;
            case BIALY:
                strap2Value = 9;
                break;
            case SZARY:
                strap2Value = 8;
                break;
            case ZOLTY:
                strap2Value = 4;
                break;
            case BRAZOWY:
                strap2Value = 1;
                break;
            case CZERWONY:
                strap2Value = 2;
                break;
            case POMARANCZOWY:
                strap2Value = 3;
                break;
            case FIOLETOWY:
                strap2Value = 7;
                break;
        }
        return strap2Value;
    }


    public Integer multiplierValue(Resistor resistor) {

        switch (resistor.getMultiplier()) {
            case CZARNY:
                multiplierValue = 1;
                break;
            case BRAZOWY:
                multiplierValue = 10;
                break;
            case CZERWONY:
                multiplierValue = 100;
                break;
            case POMARANCZOWY:
                multiplierValue = 1000;
                break;
            case ZOLTY:
                multiplierValue = 10000;
                break;
            case ZIELONY:
                multiplierValue = 100000;
                break;
            case NIEBIESKI:
                multiplierValue = 1000000;
                break;
            case FIOLETOWY:
                multiplierValue = 10000000;
                break;
            case SZARY:
                multiplierValue = 1;
                break;
            case BIALY:
                multiplierValue = 1;
                break;
        }

        return multiplierValue;
    }


    public Double toleranceValue(Resistor resistor) {

        switch (resistor.getTolerance()) {

            case BRAZOWY:
                toleranceValue = 1.0;
                break;
            case CZERWONY:
                toleranceValue = 2.0;
                break;
            case ZIELONY:
                toleranceValue = 0.5;
                break;
            case NIEBIESKI:
                toleranceValue = 0.25;
                break;
            case FIOLETOWY:
                toleranceValue = 0.1;
                break;
            case SZARY:
                toleranceValue = 0.05;
                break;

        }

        return toleranceValue;
    }

    public String resistanceOfTheResistor(Resistor resistor) {
        return "Oporność rezystora " + resistor.getId() + ": " + ((strap1Value(resistor) * 10 +
                +strap2Value(resistor)) * multiplierValue(resistor)) + " Ohm";
    }

    public String toleranceOfTheResistor(Resistor resistor) {
        return "Tolerancja rezystora:  " + toleranceValue(resistor) + " % = +/-" + (double) (((strap1Value(resistor) * 10 +
                +strap2Value(resistor)) * multiplierValue(resistor)) / (100.0D / toleranceValue(resistor))) + " Ohm" + '\n';
    }


}

















