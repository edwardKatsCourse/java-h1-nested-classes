package com.company.static_nested;

public class Outer {

    static int a = 11;

    public Outer() {
        System.out.println("Outer constructor");
        System.out.println(a);
    }

    //static nested
    public static class NestedStatic {
        public NestedStatic() {
            System.out.println("NestedStatic constructor");
            System.out.println(a);
        }
    }
}


class A {
    public static void main(String[] args) {
        com.company.static_nested.Outer outer = new com.company.static_nested.Outer();

        com.company.static_nested.Outer.NestedStatic nestedStatic = new Outer.NestedStatic();
    }
}