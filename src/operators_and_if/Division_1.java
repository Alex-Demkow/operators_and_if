package operators_and_if;

import java.util.Scanner;

public class Division_1 {

	public static void main(String[] args) {
		
		//� ���������� a � b �������� ��� ����� �����. 
		//��������� ������ ������� � ������� ��������� ������� a �� b � ��������

		Scanner sc = new Scanner(System.in);
		System.out.println("������� 1-� �����:");
		int a = sc.nextInt();

		System.out.println("������� 2-� �����:");
		int b = sc.nextInt();

		if (b == 0) {
			System.out.println("�� 0 ������ ������");
		} else {

			int div = a / b;
			int mod = a % b;
			System.out.println(a + " / " + b + " = " + div + " (" + mod + ")");
			System.out.println("�������� ������� = " + div + ", ������� �� ������� = " + mod);

		}

	}

}
