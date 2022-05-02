package operators_and_if;

import java.util.Arrays;
import java.util.Scanner;

public class OperationsWithNumbers_7 {

	public static void main(String[] args) {
		
//		��������� ������� ������� 5 ����� �����, ������������ ����������

		Scanner sc = new Scanner(System.in);
		System.out.println("������� 5 ����� �����:");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		int x4 = sc.nextInt();
		int x5 = sc.nextInt();

		// a. ����� ���� �����
		int sum = x1 + x2 + x3 + x4 + x5;
		System.out.println("����� ���� ����� = " + sum);

		// b. ������ � �������� �����
		boolean num1 = x1 % 2 == 0;
		boolean num2 = x2 % 2 == 0;
		boolean num3 = x3 % 2 == 0;
		boolean num4 = x4 % 2 == 0;
		boolean num5 = x5 % 2 == 0;
		System.out.print("������ �����: ");
		if (num1 == true && x1 != 0) {
			System.out.print(x1 + "; ");
		}
		if (num2 == true && x2 != 0) {
			System.out.print(x2 + "; ");
		}
		if (num3 == true && x3 != 0) {
			System.out.print(x3 + "; ");
		}
		if (num4 == true && x4 != 0) {
			System.out.print(x4 + "; ");
		}
		if (num5 == true && x5 != 0) {
			System.out.print(x5 + "; ");
		}
		System.out.print("�������� �����: ");
		if (num1 == false) {
			System.out.print(x1 + "; ");
		}
		if (num2 == false) {
			System.out.print(x2 + "; ");
		}
		if (num3 == false) {
			System.out.print(x3 + "; ");
		}
		if (num4 == false) {
			System.out.print(x4 + "; ");
		}
		if (num5 == false) {
			System.out.print(x5 + "; ");
		}
		System.out.println();

		// c. ���������� � ���������� �����
		System.out.print("���������� �����: " + Math.max(Math.max(Math.max(Math.max(x1, x2), x3), x4), x5));
		System.out.println("; ���������� �����: " + Math.min(Math.min(Math.min(Math.min(x1, x2), x3), x4), x5));

		// d. �����, ������� ������� �� 3 ��� �� 9
		boolean num11 = x1 % 3 == 0 || x1 % 9 == 0;
		boolean num12 = x2 % 3 == 0 || x2 % 9 == 0;
		boolean num13 = x3 % 3 == 0 || x3 % 9 == 0;
		boolean num14 = x4 % 3 == 0 || x4 % 9 == 0;
		boolean num15 = x5 % 3 == 0 || x5 % 9 == 0;
		System.out.print("�����, ������� ������� �� 3 ��� �� 9: ");
		if (num11) {
			System.out.print(x1 + "; ");
		}
		if (num12) {
			System.out.print(x2 + "; ");
		}
		if (num13) {
			System.out.print(x3 + "; ");
		}
		if (num14) {
			System.out.print(x4 + "; ");
		}
		if (num15) {
			System.out.print(x5 + "; ");
		}
		System.out.println();

		// e. �����, ������� ������� �� 5 � �� 7
		boolean num111 = x1 % 5 == 0 && x1 % 7 == 0;
		boolean num112 = x2 % 5 == 0 && x2 % 7 == 0;
		boolean num113 = x3 % 5 == 0 && x3 % 7 == 0;
		boolean num114 = x4 % 5 == 0 && x4 % 7 == 0;
		boolean num115 = x5 % 5 == 0 && x5 % 7 == 0;
		System.out.print("�����, ������� ������� �� 5 � �� 7: ");
		if (num111) {
			System.out.print(x1 + "; ");
		}
		if (num112) {
			System.out.print(x2 + "; ");
		}
		if (num113) {
			System.out.print(x3 + "; ");
		}
		if (num114) {
			System.out.print(x4 + "; ");
		}
		if (num115) {
			System.out.print(x5 + "; ");
		}
		System.out.println();

		// f. �����, ������� ����� ����� ���������� � ������� ��������
		System.out.print("�����, ������� ����� ����� ���������� � ������� ��������: ");
		if (x1 > x2) {
			System.out.print(x1 + "; " + x2 + "; ");
		} else {
			System.out.print(x1 + "; ");
		}
		if (x1 > x3 && x2 > x3) {
			System.out.print(x3 + "; ");
		} else {
			System.out.print("");
		}
		if (x1 > x4 && x2 > x4 && x3 > x4) {
			System.out.print(x4 + "; ");
		} else {
			System.out.print("");
		}
		if (x1 > x5 && x2 > x5 && x3 > x5 && x4 > x5) {
			System.out.print(x5 + "; ");
		} else {
			System.out.print("");
		}
		System.out.println();

		// g. �����, ������� ����� ����� ���������� � ������� �����������
		System.out.print("�����, ������� ����� ����� ���������� � ������� �����������: ");
		if (x1 < x2) {
			System.out.print(x1 + "; " + x2 + "; ");
		} else {
			System.out.print(x1 + "; ");
		}
		if (x3 > x1 && x3 > x2) {
			System.out.print(x3 + "; ");
		} else {
			System.out.print("");
		}
		if (x4 > x3 && x4 > x2 && x4 > x1) {
			System.out.print(x4 + "; ");
		} else {
			System.out.print("");
		}
		if (x5 > x4 && x5 > x3 && x5 > x2 && x5 > x1) {
			System.out.print(x5 + "; ");
		} else {
			System.out.print("");
		}
		System.out.println();

		// h. �����, ������� ����� ���� ����� �������� ���������
		System.out.print("�����, ������� ����� ���� ����� �������� ���������: ");
		if (((double) x1 + (double) x3) / 2 == x2) {
			System.out.print(x2 + "; ");
		}
		if (((double) x2 + (double) x4) / 2 == x3) {
			System.out.print(x3 + "; ");
		}
		if (((double) x3 + (double) x5) / 2 == x4) {
			System.out.print(x4 + "; ");
		}
		System.out.println();

		// i. �������� ��� ����� � ������� ��������, �����������
		System.out.print("����� � ������� �����������: ");
		int[] array = { x1, x2, x3, x4, x5 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		for (int i = 0, j = array.length - 1, tmp; i < j; i++, j--) {
			tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
		}
		System.out.print("����� � ������� ��������: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("" + array[i] + "; ");
		}
	}
}
