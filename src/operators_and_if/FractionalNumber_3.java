package operators_and_if;

import java.util.Scanner;

public class FractionalNumber_3 {

	public static void main(String[] args) {
		
//		В переменной x хранится число с дробной частью. 
//		Программа должна вывести в консоль округленное число x до ближайшего целого.


		Scanner sc = new Scanner(System.in);
		System.out.println("Введите дробное число:");
		double x = sc.nextDouble();

		// вариант 1

		if (Math.abs(x % 1) >= 0.5) {
			if (x > 0) {
				System.out.println("(Вариант 1) x = " + ((int) x + 1));
			} else {
				System.out.println("(Вариант 1) x = " + ((int) x - 1));
			}

		} else {
			System.out.println("(Вариант 1) x = " + (int) x);
		}

		// вариант 2

		System.out.println("(Вариант 2) x = " + Math.round(x));

	}

}
