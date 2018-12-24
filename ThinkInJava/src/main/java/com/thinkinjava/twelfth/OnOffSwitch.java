package com.thinkinjava.twelfth;

public class OnOffSwitch {

    private static Switch sw = new Switch();

    public static void f() throws OnOffException1,OnOffException2{
    }

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
        } catch (OnOffException1 onOffException1) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 onOffException2) {
            System.out.println("OnOffException2");
            sw.on();
        }
    }
}
