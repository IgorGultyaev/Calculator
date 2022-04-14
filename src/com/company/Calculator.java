package com.company;

import java.util.function.*;

public class Calculator implements Supplier{
    static Supplier instance;
@Override
    public Object get() {
        return instance;
    }

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;
    String s = "dxsxsx";

    Consumer<Integer> println = System.out::println;




}
