package com.thinkinjava.tenth;

public class DotNew {
    public class Inner {
        public Inner() {
            System.out.println("new Instance");
        }
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
