package operators_and_if;
import java.util.Scanner;
public class GuessTheNumber_14 {
	public static void main(String[] args) {
		
//		Игра угадай число. 
//		Пользователь задает диапазон угадываемого им числа с клавиатуры. (верхний и нижний пределы)
//		Пользователь задает количество попыток что бы угадать число с клавиатуры.
//		Если это произошло – выдать сообщение «Вы выйграли»

		
		System.out.println("Игра - угадай число");
		System.out.print("Задайте нижний предел диапазона угадываемых чисел: ");
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		System.out.print("Задайте верхний предел диапазона угадываемых чисел: ");
		int max = sc.nextInt();
		if (max <= min) {
			System.out.print("Неверно заданы пределы");
		} else {
			System.out.print("Задайте количество попыток: ");
			int amount = sc.nextInt();
			if (amount <= 0) {
				System.out.print("Неверно задано количество попыток");
			} else {
				double x = Math.random();
				int number = (int) (x * (max - min)) + min;
				// System.out.println("Угадываемое число: " + number);
				for (int i = 1; i <= amount; i++) {
					System.out.printf("Попытка %d \n", i);
					System.out.print("Угадайте число: ");
					int у1 = sc.nextInt();
					if (у1 == number) {
						System.out.printf("Поздравляю! Вы угадали число c %d попыток! \n", i);
						break;
					} else if (у1 > number) {
						System.out.println("Ваше число больше");
					} else {
						System.out.println("Ваше число меньше");
					}
					if (i == amount) {
						System.out.println("Вы проиграли!");
					}
				}
			}
		}
	}
}
