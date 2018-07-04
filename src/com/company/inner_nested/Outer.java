package com.company.inner_nested;

public class Outer {
    int counter = 0;
    String s = "counter: ";

    private void print() {
    }

    public Outer() {
        System.out.println("Outer constructor");
    }

    public class Inner {
        public Inner() {
            System.out.println("Inner constructor");
            ++counter;
            print();
        }
    }

    public String getS() {
        return s + counter;
    }
}


class A {
    public static void main(String[] args) {
        /**
         * МОЖЕТ БЫТЬ
         * 1. Outer без Inners
         * 2. у Outer есть Inner
         * 3. у Outer есть много Inners
         * 4. разные Outers и связанные с ними Inners
         *
         * НЕ МОЖЕТ БЫТЬ
         * 1. у Inner нету Outer
         */
        Outer o1 = new Outer();

        Outer.Inner i1 = o1.new Inner();
        Outer.Inner i2 = o1.new Inner();
        Outer.Inner i3 = o1.new Inner();

        System.out.println("Outer getter: " + o1.getS());
        ;
    }
}