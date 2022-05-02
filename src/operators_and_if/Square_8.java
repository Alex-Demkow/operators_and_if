package operators_and_if;

import java.util.Scanner;

public class Square_8 {

	public static void main(String[] args) {
		
//		����� ������� ��������������� ��������� 3 �������

		Scanner sc1 = new Scanner(System.in);
		// ������� 1
		System.out.println("������� ��������������� (������� 1)");	
		System.out.print("������� ������� ���������������: � = ");
		double a1 = sc1.nextDouble();
		if (a1 <= 0) {
			System.out.print("������� ��������������� �� ����� ���� ������������� ��� ��������� 0");
		} else {
			System.out.print("������� ������ ����������� � ������� �: h = ");
			double h1 = sc1.nextDouble();
			if (h1 <= 0) {
				System.out.print(
						"������ ����������� � ������� ��������������� �� ����� ���� ������������� ��� ��������� 0");
			} else {
				double s1 = a1 * h1;
				System.out.println("������� ��������������� �����: S = " + s1);
			}
		}

		// ������� 2
		System.out.println("������� ��������������� (������� 2)");		
		System.out.print("������� ������� ���������������: � = ");
		double a2 = sc1.nextDouble();
		if (a2 <= 0) {
			System.out.print("������� ��������������� �� ����� ���� ������������� ��� ��������� 0");
		} else {
			System.out.print("������� ������� ���������������: b = ");
			double b2 = sc1.nextDouble();
			if (b2 <= 0) {
				System.out.print("������� ��������������� �� ����� ���� ������������� ��� ��������� 0");
			} else {
				System.out.print("������� �������� ���� ����� ��������� ���������������: A = ");
				double degrees2 = sc1.nextDouble();
				if (degrees2 <= 0) {
					System.out.print("���� ����� ��������� ��������������� �� ����� ���� ������������� ��� ��������� 0");
				} else {
					double radians2 = Math.toRadians(degrees2);
					double sinAngle2 = Math.sin(radians2);
					double s2 = a2 * b2 * sinAngle2;
					System.out.println("������� ��������������� �����: S = " + s2);
				}
			}
		}

		// ������� 3
		System.out.println("������� ��������������� (������� 3)");
		System.out.print("������� ������ ��������� ���������������: d1 = ");
		double d1 = sc1.nextDouble();
		if (d1 <= 0) {
			System.out.print("��������� ��������������� �� ����� ���� ������������� ��� ��������� 0");
		} else {
			System.out.print("������� ������ ��������� ���������������: d2 = ");
			double d2 = sc1.nextDouble();
			if (d2 <= 0) {
				System.out.print("��������� ��������������� �� ����� ���� ������������� ��� ��������� 0");
			} else {
				System.out.print("������� �������� ���� ����� ����������� ���������������: B = ");
				double degrees3 = sc1.nextDouble();
				if (degrees3 <= 0) {
					System.out.print("���� ����� ��������� ����������� �� ����� ���� ������������� ��� ��������� 0");
				} else {
					double radians3 = Math.toRadians(degrees3);
					double sinAngle3 = Math.sin(radians3);
					double s3 = (d1 * d2) / 2 * sinAngle3;
					System.out.println("������� ��������������� �����: S = " + s3);
				}
			}
		}
	}
}
