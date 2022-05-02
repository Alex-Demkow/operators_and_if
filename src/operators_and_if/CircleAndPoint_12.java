package operators_and_if;

import java.util.Scanner;

public class CircleAndPoint_12 {

	public static void main(String[] args) {
		
//		Даны координаты точки и радиус круга с центром в начале координат.

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите значение х: ");
		double x = sc.nextDouble();
		System.out.print("Введите значение y: ");
		double y = sc.nextDouble();
		System.out.print("Введите радиус R: ");
		double r = sc.nextDouble();
		double z = Math.sqrt(x * x + y * y);
		
		if (r >= z) {
			System.out.println("Точка принадлежит кругу");
		} else {
			System.out.println("Точка непринадлежит кругу");
		}
	}
}
