package operators_and_if;

import java.util.Scanner;

public class Square_8 {

	public static void main(String[] args) {
		
//		Найти площадь параллелограмма используя 3 способа

		Scanner sc1 = new Scanner(System.in);
		// решение 1
		System.out.println("Площадь параллелограмма (решение 1)");	
		System.out.print("Введите сторону параллелограмма: а = ");
		double a1 = sc1.nextDouble();
		if (a1 <= 0) {
			System.out.print("Сторона параллелограмма не может быть отрицательной или равняться 0");
		} else {
			System.out.print("Введите высоту проведенную к стороне а: h = ");
			double h1 = sc1.nextDouble();
			if (h1 <= 0) {
				System.out.print(
						"Высота проведенная к стороне параллелограмма не может быть отрицательной или равняться 0");
			} else {
				double s1 = a1 * h1;
				System.out.println("Площадь параллелограмма равна: S = " + s1);
			}
		}

		// решение 2
		System.out.println("Площадь параллелограмма (решение 2)");		
		System.out.print("Введите сторону параллелограмма: а = ");
		double a2 = sc1.nextDouble();
		if (a2 <= 0) {
			System.out.print("Сторона параллелограмма не может быть отрицательной или равняться 0");
		} else {
			System.out.print("Введите сторону параллелограмма: b = ");
			double b2 = sc1.nextDouble();
			if (b2 <= 0) {
				System.out.print("Сторона параллелограмма не может быть отрицательной или равняться 0");
			} else {
				System.out.print("Введите значение угла между сторонами параллелограмма: A = ");
				double degrees2 = sc1.nextDouble();
				if (degrees2 <= 0) {
					System.out.print("Угол между сторонами параллелограмма не может быть отрицательным или равняться 0");
				} else {
					double radians2 = Math.toRadians(degrees2);
					double sinAngle2 = Math.sin(radians2);
					double s2 = a2 * b2 * sinAngle2;
					System.out.println("Площадь параллелограмма равна: S = " + s2);
				}
			}
		}

		// решение 3
		System.out.println("Площадь параллелограмма (решение 3)");
		System.out.print("Введите первую диагональ параллелограмма: d1 = ");
		double d1 = sc1.nextDouble();
		if (d1 <= 0) {
			System.out.print("Диагональ параллелограмма не может быть отрицательной или равняться 0");
		} else {
			System.out.print("Введите вторую диагональ параллелограмма: d2 = ");
			double d2 = sc1.nextDouble();
			if (d2 <= 0) {
				System.out.print("Диагональ параллелограмма не может быть отрицательной или равняться 0");
			} else {
				System.out.print("Введите значение угла между диагоналями параллелограмма: B = ");
				double degrees3 = sc1.nextDouble();
				if (degrees3 <= 0) {
					System.out.print("Угол между сторонами диагоналями не может быть отрицательным или равняться 0");
				} else {
					double radians3 = Math.toRadians(degrees3);
					double sinAngle3 = Math.sin(radians3);
					double s3 = (d1 * d2) / 2 * sinAngle3;
					System.out.println("Площадь параллелограмма равна: S = " + s3);
				}
			}
		}
	}
}
