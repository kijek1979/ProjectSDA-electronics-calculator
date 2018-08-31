package com.electronics_elements_calculator;


import com.electronics_elements_calculator.model.Resistor;
import com.electronics_elements_calculator.model.ResistorStrapsColors;
import com.electronics_elements_calculator.service.ResistorService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ResistorServiceTest {

    private ResistorService resistorService;
    private Resistor resistor;

    @Before
    public void createResistor(){
         resistor = new Resistor( ResistorStrapsColors.ZOLTY,ResistorStrapsColors.CZARNY,
                 ResistorStrapsColors.CZARNY, ResistorStrapsColors.CZERWONY);
    }

    @Before
    public void createResistoreService(){
         resistorService = new ResistorService();
    }
    @Test
    public void isStrap1ValueMethodWorking(){
        Integer expectedValue = 4;
        Assert.assertEquals(expectedValue ,resistorService.strap1Value(resistor));
    }
    @Test
    public void isStrap2ValueMethodWorking(){
        Integer expectedValue = 0;
        Assert.assertEquals(expectedValue ,resistorService.strap2Value(resistor));
    }

    @Test
    public void isMultiplierValueMethodWorking(){
        Integer expectedValue = 1;
        Assert.assertEquals(expectedValue ,resistorService.multiplierValue(resistor));
    }
    @Test
    public void isToleranceValueMethodWorking(){
        Double expectedValue = 2.0;
        Assert.assertEquals(expectedValue ,resistorService.toleranceValue(resistor));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void  isArrayIndexOutOfBoundsExceptionWorking(){
        resistorService.elementRemoveFromList(3);
    }







}
