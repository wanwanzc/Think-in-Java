package com.thinkinjava.eleventh;

import com.thinkinjava.typeinfo.pets.Pet;
import com.thinkinjava.typeinfo.pets.Pets;

import java.util.*;

public class CrossContainerIteration {

    public static void display(Iterator<Pet> iterator) {
        while (iterator.hasNext()) {
            Pet p = iterator.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
        HashSet<Pet> petsHS = new HashSet<Pet>(pets);
        TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
