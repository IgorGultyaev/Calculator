package com.company;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println("ew2e");

        Calculator calc = Calculator.instance.get();
        // мы создаем переменную, типа Supplier для организации передачи некоторого типа значения которые описаны
        // в классе методами при этом значение может быть любым лиш бы был такой метод
        // как бы возвращаем через эту переменную любое значение интовое и стринговое, лиш бы метод был
        // соответствующий как бы переменныя для перекидывания

        UnaryOperator<Integer> pow = x -> x * x;
        UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        int c = calc.devide.apply(a, b);
        String s = calc.s;



        calc.println.accept(c);




    }
}
