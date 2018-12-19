package com.thinkinjava.tenth;

public class Pracel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }
            @Override
            public String readLabel() {
                return null;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Pracel5 p = new Pracel5();
        Destination d = p.destination("Tasmania");
    }
}
