package com.company;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println("ew2e");

        Calculator calc = Calculator.instance.get();

        UnaryOperator<Integer> pow = x -> x * x;
        UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        int c = calc.devide.apply(a, b);

        calc.println.accept(c);


    }
}
