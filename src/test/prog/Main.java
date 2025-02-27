package test.prog;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		double res = 0;

		try {
			System.out.println("Введите выражение для вычисления: ");
			res = calc.getExp(scan.nextLine());
			if (res == Double.MIN_VALUE) System.out.println("Произошла ошибка при вычислении!");
			else System.out.printf("= %.2f",res);
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
		}
    }
}
