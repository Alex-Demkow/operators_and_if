package operators_and_if;
import java.util.Scanner;
public class GuessTheNumber_14 {
	public static void main(String[] args) {
		
//		���� ������ �����. 
//		������������ ������ �������� ������������ �� ����� � ����������. (������� � ������ �������)
//		������������ ������ ���������� ������� ��� �� ������� ����� � ����������.
//		���� ��� ��������� � ������ ��������� ��� ��������

		
		System.out.println("���� - ������ �����");
		System.out.print("������� ������ ������ ��������� ����������� �����: ");
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		System.out.print("������� ������� ������ ��������� ����������� �����: ");
		int max = sc.nextInt();
		if (max <= min) {
			System.out.print("������� ������ �������");
		} else {
			System.out.print("������� ���������� �������: ");
			int amount = sc.nextInt();
			if (amount <= 0) {
				System.out.print("������� ������ ���������� �������");
			} else {
				double x = Math.random();
				int number = (int) (x * (max - min)) + min;
				// System.out.println("����������� �����: " + number);
				for (int i = 1; i <= amount; i++) {
					System.out.printf("������� %d \n", i);
					System.out.print("�������� �����: ");
					int �1 = sc.nextInt();
					if (�1 == number) {
						System.out.printf("����������! �� ������� ����� c %d �������! \n", i);
						break;
					} else if (�1 > number) {
						System.out.println("���� ����� ������");
					} else {
						System.out.println("���� ����� ������");
					}
					if (i == amount) {
						System.out.println("�� ���������!");
					}
				}
			}
		}
	}
}
