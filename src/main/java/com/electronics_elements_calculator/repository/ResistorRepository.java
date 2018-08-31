package com.electronics_elements_calculator.repository;

import com.electronics_elements_calculator.model.Resistor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public abstract class ResistorRepository implements ElementRepository {

    protected List<Resistor> resistorList = new ArrayList<>();

    public List<Resistor> getResistorList() {
        return resistorList;
    }

    @Override
    public abstract Resistor elementAddToList(Object o);

    @Override
    public abstract void elementRemoveFromList(int index);



}
