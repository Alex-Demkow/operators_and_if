package operators_and_if;

import java.util.Scanner;

public class VariableRealType_9 {

	public static void main(String[] args) {
		
//		Даны три переменные вещественного типа: a,b,c. 
//		Если их значения упорядочены по возрастанию (порядок инициализации),
//		то удвоить их; в противном случае заменить значение каждой переменной
//		на противоположное. Вывести новые значения переменных a,b,c.


		Scanner sc = new Scanner(System.in);
		System.out.println("Введите три переменные:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		if (a < b && b < c) {
			double a1 = a*2;
			double b1 = b*2;
			double c1 = c*2;
			System.out.println("а = " + a1 + "; b = " + b1 + "; c = " + c1);
		} else {
			double a2 = a*(-1);
			double b2 = b*(-1);
			double c2 = c*(-1);
			System.out.println("а = " + a2 + "; b = " + b2 + "; c = " + c2);
		}
	}

}
