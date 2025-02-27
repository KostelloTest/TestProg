package test.prog;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator {

    double a = 0;
    double b = 0;
    String operation;

    Calculator() {

    }

    protected double getExp(String s) {
        String [] lst = null;
        lst = s.split(" ");

        this.a = Double.parseDouble(lst[0]);
        this.operation = lst[1];
        this.b = Double.parseDouble(lst[2]);


        switch (operation) {
            case "+":
                return sum();
            case "-":
                return sub();
            case "/":
                return div();
            case "*":
                return mul();
        }
        return Double.MIN_VALUE;
    }

    protected double sum() {
        return a + b;
    }

    protected double mul() {
        return a * b;
    }

    protected double div() {
        // n / 0 = infinity
        return a / b;
    }

    protected double sub() {
        return a - b;
    }

}
