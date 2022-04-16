package com.company;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

//    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? y : x / y;

//    BinaryOperator<Integer> devide = (x, y) -> {
//        try {
//            return x / y;
//        } catch (Exception e){
//            System.out.println("ошибка, деление на ноль");
//        }
//        return y;
//    };



    // x == 0 ? x : x / y;

    String s = "dxsxsx";

    Consumer<Integer> println = System.out::println;

}
