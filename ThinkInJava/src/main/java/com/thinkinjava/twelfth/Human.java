package com.thinkinjava.twelfth;

public class Human {

    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance annoyance) {
            System.out.println("Caught Annoyance");
        }

        try {
            throw new Sneeze();
        } catch (Annoyance annoyance) {
            System.out.println("Caught Annoyance");
        }
    }
}

class Annoyance extends Exception {

}

class Sneeze extends Annoyance {

}