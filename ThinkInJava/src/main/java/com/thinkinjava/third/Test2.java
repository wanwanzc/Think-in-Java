package com.thinkinjava.third;

/**
 * @author wuzhicheng
 * @date 2018/10/21
 */
public class Test2 {
    public static void main(String[] args) {
        Alias alias1 = new Alias();
        Alias alias2 = new Alias();

        alias1.a = 0.6f;
        alias2.a = 6.6f;
        System.out.println("1: alias1.a: "+ alias1.a + ", 2: alias2.a: " + alias2.a);

        alias1 = alias2;
        System.out.println("2: alias1.a: "+ alias1.a + ", 2: alias2.a: " + alias2.a);

        alias1.a = 8.8f;
        System.out.println("3: alias1.a: "+ alias1.a + ", 2: alias2.a: " + alias2.a);

    }
}

class Alias {
    float a;
}
