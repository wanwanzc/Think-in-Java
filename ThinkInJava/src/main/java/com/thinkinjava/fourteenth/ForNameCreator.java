package com.thinkinjava.fourteenth;

import com.thinkinjava.typeinfo.pets.Pet;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();

    private static String[] typeNames = {
            "com.thinkinjava.typeinfo.pets.Mutt",
            "com.thinkinjava.typeinfo.pets.Pug",
            "com.thinkinjava.typeinfo.pets.EgyptianMau",
            "com.thinkinjava.typeinfo.pets.Manx",
            "com.thinkinjava.typeinfo.pets.Cymric",
            "com.thinkinjava.typeinfo.pets.Rat",
            "com.thinkinjava.typeinfo.pets.Mouse",
            "com.thinkinjava.typeinfo.pets.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        for (String name : typeNames) {
            try {
                types.add((Class<? extends Pet>) Class.forName(name));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
