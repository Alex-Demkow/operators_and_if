package operators_and_if;

import java.util.Scanner;

public class FractionalNumber_3 {

	public static void main(String[] args) {
		
//		� ���������� x �������� ����� � ������� ������. 
//		��������� ������ ������� � ������� ����������� ����� x �� ���������� ������.


		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������� �����:");
		double x = sc.nextDouble();

		// ������� 1

		if (Math.abs(x % 1) >= 0.5) {
			if (x > 0) {
				System.out.println("(������� 1) x = " + ((int) x + 1));
			} else {
				System.out.println("(������� 1) x = " + ((int) x - 1));
			}

		} else {
			System.out.println("(������� 1) x = " + (int) x);
		}

		// ������� 2

		System.out.println("(������� 2) x = " + Math.round(x));

	}

}
