package com.thinkinjava.third;

/**
 * @author wuzhicheng
 * @date 2018/10/21
 */
public class Test3 {
    static void f(Letter y) {
        y.f = 8.8f;
    }

    public static void main(String[] args){
        Letter x = new Letter();
        x.f = 6.6f;
        System.out.println("1: x.f: " + x.f);
        f(x);
        System.out.println("2: x.f: " + x.f);
    }
}

class Letter {
    float f;
}
