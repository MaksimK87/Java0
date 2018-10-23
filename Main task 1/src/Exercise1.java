/*Разработайте программу, которая проверяет, что числа a, b и c различны (одинаковы).
 * */

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.print("Введите a: ");
		a = in.nextInt();
		System.out.print("Введите b: ");
		b = in.nextInt();
		System.out.print("Введите c: ");
		c = in.nextInt();
		if (a == b && a == c) {
			System.out.println("Числа a, b ,c - одинаковы");
		} else {
			System.out.println("Числа a, b ,c - различны");
		}

	}

}
