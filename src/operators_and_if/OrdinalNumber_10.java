package operators_and_if;

import java.util.Scanner;

public class OrdinalNumber_10 {

	public static void main(String[] args) {
		
//		���� ������ ����� �����, ���� �� ������� ������� �� ���� ������,
//		������ ����� �����. ���������� ���������� ����� ����� (����� ���
//		�������������), ��������� �� ���������.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� 4 ����� �����, ��� �� ������� �����");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		int x4 = sc.nextInt();
		
		if (x1 != x2 && x1 != x3 && x1 != x4) {
			System.out.println("���������� ����� �����: 1");
		}
		if (x2 != x1 && x2 != x3 && x2 != x4) {
			System.out.println("���������� ����� �����: 2");
		}
		if (x3 != x1 && x3 != x2 && x3 != x4) {
			System.out.println("���������� ����� �����: 3");
		}
		if (x4 != x1 && x4 != x2 && x4 != x3) {
			System.out.println("���������� ����� �����: 4");
		}		
	}
}