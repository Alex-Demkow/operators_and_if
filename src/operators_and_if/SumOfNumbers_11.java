package operators_and_if;

import java.util.Scanner;

public class SumOfNumbers_11 {

	public static void main(String[] args) {
		
//		���� ��� �����. ����� ����� ���� ���������� �� ���.

		System.out.println("����� ���� ���������� �����");
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ����� a:");
		int a = sc.nextInt();
		System.out.print("������� ����� b:");
		int b = sc.nextInt();
		System.out.print("������� ����� c:");
		int c = sc.nextInt();
		
		if (a >= b && b > c || a <= b && a > c || a > b && b == c) {
			int sum = a + b;
			System.out.print("����� ���� ���������� �����: " + sum);
		}  else if (a < b && b <= c || c <= b && c > a || c > b && b == a) {
			int sum1 = b + c;
			System.out.print("����� ���� ���������� �����: " + sum1);
		} else {
			int sum2 = a + c;
			System.out.print("����� ���� ���������� �����: " + sum2);
		}	
	}
}
