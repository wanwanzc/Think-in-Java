package com.thinkinjava.fifteenth;

public class FiveFuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {

    public final E fifth;

    public FiveFuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        fifth = e;
    }

    public String toString() {
        return "(" + first + ", " + second + ", " + third + ", " + fourth + "," + fifth + ")";
    }

}
