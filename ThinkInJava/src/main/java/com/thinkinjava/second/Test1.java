package com.thinkinjava.second;

/**
 * @author wuzhicheng
 * @date 2018/10/21
 */
public class Test1 {

    public static void main(String[] args) {

        PrimitiveType primitiveType = new PrimitiveType();

        System.out.println(primitiveType.a);
        System.out.println(primitiveType.b);
        System.out.println(primitiveType.c);
        System.out.println(primitiveType.d);
        System.out.println(primitiveType.e);
        System.out.println(primitiveType.f);
        System.out.println(primitiveType.g);
        System.out.println(primitiveType.h);

    }
}

class PrimitiveType {
    boolean a;
    char b;
    byte c;
    short d;
    int e;
    long f;
    float g;
    double h;
}
