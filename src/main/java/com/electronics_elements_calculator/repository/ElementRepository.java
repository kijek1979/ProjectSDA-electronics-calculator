package com.electronics_elements_calculator.repository;

import com.electronics_elements_calculator.model.Resistor;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementRepository  {



     Resistor elementAddToList(Object o);

    void elementRemoveFromList(int index);




}
