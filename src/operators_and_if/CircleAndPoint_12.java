package operators_and_if;

import java.util.Scanner;

public class CircleAndPoint_12 {

	public static void main(String[] args) {
		
//		���� ���������� ����� � ������ ����� � ������� � ������ ���������.

		Scanner sc = new Scanner(System.in);
		System.out.print("������� �������� �: ");
		double x = sc.nextDouble();
		System.out.print("������� �������� y: ");
		double y = sc.nextDouble();
		System.out.print("������� ������ R: ");
		double r = sc.nextDouble();
		double z = Math.sqrt(x * x + y * y);
		
		if (r >= z) {
			System.out.println("����� ����������� �����");
		} else {
			System.out.println("����� ������������� �����");
		}
	}
}
