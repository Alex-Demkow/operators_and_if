package operators_and_if;

import java.util.Scanner;

public class SumOfNumbers_11 {

	public static void main(String[] args) {
		
//		Даны три числа. Найти сумму двух наибольших из них.

		System.out.println("Сумма двух наибольших чисел");
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число a:");
		int a = sc.nextInt();
		System.out.print("Введите число b:");
		int b = sc.nextInt();
		System.out.print("Введите число c:");
		int c = sc.nextInt();
		
		if (a >= b && b > c || a <= b && a > c || a > b && b == c) {
			int sum = a + b;
			System.out.print("Сумма двух наибольших чисел: " + sum);
		}  else if (a < b && b <= c || c <= b && c > a || c > b && b == a) {
			int sum1 = b + c;
			System.out.print("Сумма двух наибольших чисел: " + sum1);
		} else {
			int sum2 = a + c;
			System.out.print("Сумма двух наибольших чисел: " + sum2);
		}	
	}
}
