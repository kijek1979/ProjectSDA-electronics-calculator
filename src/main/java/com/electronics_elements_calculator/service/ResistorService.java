package com.electronics_elements_calculator.service;


import com.electronics_elements_calculator.model.Resistor;
import org.springframework.stereotype.Service;

@Service
public class ResistorService {


        private Resistor resistor;

        public Resistor createResistor(Resistor resistor){
            return new Resistor();
        }


        public Integer strap1Value(Resistor resistor) {
            Integer strap1Value = 0;
            switch (resistor.getStrap1()) {
                case "czarny":
                    strap1Value = 0;
                    break;
                case "niebieski":
                    strap1Value = 6;
                    break;
                case "zielony":
                    strap1Value = 5;
                    break;
                case "bialy":
                    strap1Value = 9;
                    break;
                case "szary":
                    strap1Value = 8;
                    break;
                case "żółty":
                    strap1Value = 4;
                    break;
                case "brązowy":
                    strap1Value = 1;
                    break;
                case "czerwony":
                    strap1Value = 2;
                    break;
                case "pomarańczowy":
                    strap1Value = 3;
                    break;
                case "fioletowy":
                    strap1Value = 7;
                    break;
            }
            return strap1Value;
        }

        public Integer strap2Value(Resistor resistor) {
            Integer strap2Value = 0;
            switch (resistor.getStrap2()) {
                case "czarny":
                    strap2Value = 0;
                    break;
                case "niebieski":
                    strap2Value = 6;
                    break;
                case "zielony":
                    strap2Value = 5;
                    break;
                case "bialy":
                    strap2Value = 9;
                    break;
                case "szary":
                    strap2Value = 8;
                    break;
                case "żółty":
                    strap2Value = 4;
                    break;
                case "brązowy":
                    strap2Value = 1;
                    break;
                case "czerwony":
                    strap2Value = 2;
                    break;
                case "pomarańczowy":
                    strap2Value = 3;
                    break;
                case "fioletowy":
                    strap2Value = 7;
                    break;
            }
            return strap2Value;
        }

        public Integer multiplierValue(Resistor resistor) {
            Integer multiplierValue = 0;
            switch (resistor.getMultiplier()) {
                case "czarny":
                    multiplierValue = 1;
                    break;
                case "brązowy":
                    multiplierValue = 10;
                    break;
                case "czerwony":
                    multiplierValue = 100;
                    break;
                case "pomarańczowy":
                    multiplierValue = 1000;
                    break;
                case "żółty":
                    multiplierValue = 10000;
                    break;
                case "zielony":
                    multiplierValue = 100000;
                    break;
                case "niebieski":
                    multiplierValue = 1000000;
                    break;
                case "fioletowy":
                    multiplierValue = 10000000;
                    break;
                case "szary":
                    multiplierValue = 1;
                    break;
                case "biały":
                    multiplierValue = 1;
                    break;
            }

            return multiplierValue;
        }

        public Double toleranceValue(Resistor resistor) {
            Double toleranceValue = 0.0;
            switch (resistor.getTolerance()) {

                case "brązowy":
                    toleranceValue = 1.0;
                    break;
                case "czerwony":
                    toleranceValue = 2.0;
                    break;
                case "zielony":
                    toleranceValue = 0.5;
                    break;
                case "niebieski":
                    toleranceValue = 0.25;
                    break;
                case "fioletowy":
                    toleranceValue = 0.1;
                    break;
                case "szary":
                    toleranceValue = 0.05;
                    break;

            }

            return toleranceValue;
        }

        public String resistanceOfTheResistor(Resistor resistor){
            return "Oporność rezystora " +resistor.getId()+": "+((strap1Value(resistor)*10+
                    +strap2Value(resistor))*multiplierValue(resistor))+" Ohm";
        }

        public String toleranceOfTheResistor(Resistor resistor){
            return "Tolerancja rezystora:  " + toleranceValue(resistor)+ " % = +/-" + (double)(((strap1Value(resistor)*10+
                    +strap2Value(resistor))*multiplierValue(resistor)) / (100.0D / toleranceValue(resistor))) + " Ohm" + '\n';
        }


    }

















