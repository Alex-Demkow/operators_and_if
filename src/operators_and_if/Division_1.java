package operators_and_if;

import java.util.Scanner;

public class Division_1 {

	public static void main(String[] args) {
		
		//В переменных a и b хранятся два целых числа. 
		//Программа должна вывести в консоль результат деления a на b с остатком

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите 1-е число:");
		int a = sc.nextInt();

		System.out.println("Введите 2-е число:");
		int b = sc.nextInt();

		if (b == 0) {
			System.out.println("на 0 делить нельзя");
		} else {

			int div = a / b;
			int mod = a % b;
			System.out.println(a + " / " + b + " = " + div + " (" + mod + ")");
			System.out.println("Неполное частное = " + div + ", остаток от деления = " + mod);

		}

	}

}
