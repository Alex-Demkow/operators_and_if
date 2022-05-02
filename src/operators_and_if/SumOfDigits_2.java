package operators_and_if;

import java.util.Scanner;

public class SumOfDigits_2 {

	public static void main(String[] args) {
		
//		В переменной x хранится двузначное  целое число. 
//		Программа должна вывести в консоль  сумму цифр этого числа.  


		Scanner sc = new Scanner(System.in);
		System.out.println("Введите двузначное число:");
		int a = sc.nextInt();
		if (a > -10 && a < 10 || a >= 100 || a <= -100) {
			System.out.println("Введено неверное число");
		} else {
			// вариант 1
			int x1 = a / 10;
			System.out.println("x1 = " + x1);
			int y1 = Math.abs(a - (x1 * 10)); // Math.abs необходим если а - отрицательное число
			System.out.println("y1 = " + y1);
			int sum1 = x1 + y1;
			System.out.println("Сумма варианта 1 = " + sum1);

			// вариант 2
			int x2 = a / 10;
			System.out.println("x2 = " + x2);
			int y2 = Math.abs(a % 10); // Math.abs необходим если а - отрицательное число
			System.out.println("y2 = " + y2);
			int sum2 = x2 + y2;
			System.out.println("Сумма варианта 2 = " + sum2);

		}

	}

}
