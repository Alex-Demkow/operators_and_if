package operators_and_if;

import java.util.Scanner;

public class MaxNumber_5 {

	public static void main(String[] args) {

		System.out.println("Максимальное число");
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите целое число a: ");
		int a = sc.nextInt();
		System.out.print("Введите целое число b: ");
		int b = sc.nextInt();
		System.out.print("Введите целое число c: ");
		int c = sc.nextInt();		
				
		Math.max((int)a, (int)b);
		System.out.println("max = " + Math.max(Math.max((int)a, (int)b), (int)c));
	}
}
