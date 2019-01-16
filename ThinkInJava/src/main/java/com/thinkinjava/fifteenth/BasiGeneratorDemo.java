package com.thinkinjava.fifteenth;

import com.thinkinjava.util.Generator;

public class BasiGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);

        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }

}
