/*������������ ���������, ������� ���������, ��� ����� a, b � c �������� (���������).
 * */

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.print("������� a: ");
		a = in.nextInt();
		System.out.print("������� b: ");
		b = in.nextInt();
		System.out.print("������� c: ");
		c = in.nextInt();
		if (a == b && a == c) {
			System.out.println("����� a, b ,c - ���������");
		} else {
			System.out.println("����� a, b ,c - ��������");
		}

	}

}