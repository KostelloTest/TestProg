package test.prog;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Input num A: ");
			double a = scan.nextDouble();
			System.out.println("Input num B: ");
			double b = scan.nextDouble();

			System.out.printf("\n%.2f + %.2f = %.2f", a, b, calc.sum(a,b));
			System.out.printf("\n%.2f - %.2f = %.2f", a, b, calc.sub(a,b));
			System.out.printf("\n%.2f * %.2f = %.2f", a, b, calc.mul(a,b));
			System.out.printf("\n%.2f / %.2f = %.2f", a, b, calc.div(a,b));
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
		}
    }
}
