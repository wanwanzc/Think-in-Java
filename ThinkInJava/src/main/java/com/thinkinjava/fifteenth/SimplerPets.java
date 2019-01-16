package com.thinkinjava.fifteenth;

import com.thinkinjava.typeinfo.pets.Person;
import com.thinkinjava.typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

public class SimplerPets {

    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
    }
}
