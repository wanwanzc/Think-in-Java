package com.thinkinjava.fifteenth;

import com.thinkinjava.fourteenth.Person;
import com.thinkinjava.typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

public class LimitsOfInference {

    static void f(Map<Person, List<Pet>> petPeople) {}

    public static void main(String[] args) {

        f(New.<Person, List<Pet>>map());
    }
}
