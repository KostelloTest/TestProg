package test.prog;

import java.lang.reflect.Array;
import java.lang.reflect.Executable;
import java.util.ArrayList;

public class Calculator {

    double a = 0;
    double b = 0;
    String operation;

    Calculator() {

    }

    protected double process() {
        try {
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
        } catch (Exception e) {
            System.out.println("Ошибка при вычислениях: " + e);
        }
        return Double.MIN_VALUE;
    }

    protected double getExp(String s) {
        String [] lst = null;
        try {
            lst = s.split(" ");

            this.a = Double.parseDouble(lst[0]);
            this.operation = lst[1];
            this.b = Double.parseDouble(lst[2]);

        } catch (Exception e) {
            System.out.println("Ошибка при парсинге строки: " + e);
        }
        return process();
    }

    protected double sum() {
        return a + b;
    }

    protected double mul() {
        return a * b;
    }

    protected double div() {
        if (b == 0) {
            System.out.println("На 0 делить нельзя!");
            return Double.MIN_VALUE;
        }
        return a / b;
    }

    protected double sub() {
        return a - b;
    }

}
