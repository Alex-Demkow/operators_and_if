package operators_and_if;

import java.util.Scanner;

public class SumOfDigits_4 {

	public static void main(String[] args) {
		
//		� ���������� x �������� ����� ����������� �����. 
//		�������� ���������, ����������� � ��������� �� ����� ����� ���� ����� x.


		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���������� �����:");
		int x = sc.nextInt();
		if (x > -10000 && x < 10000 || x >= 1000000 || x <= -1000000) {
			System.out.println("������� �������� �����");
		} else {

			// Math.abs() ��������� ���� x - ������������� �����

			int num5 = Math.abs(x % 10);
			System.out.println("num5 = " + num5);
			int num4 = Math.abs(x / 10) % 10;
			System.out.println("num4 = " + num4);
			int num3 = Math.abs(x / 100) % 10;
			System.out.println("num3 = " + num3);
			int num2 = Math.abs(x / 1000) % 10;
			System.out.println("num2 = " + num2);
			int num1 = (x / 10000) % 10;
			System.out.println("num1 = " + num1);
			System.out.println("����� ���� = " + (num1 + num2 + num3 + num4 + num5));
		}		
	}
}
