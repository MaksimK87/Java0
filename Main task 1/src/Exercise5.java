import java.util.Scanner;

/*) �������� ���������, ������� ������� �������������� � �������������� ������� ����
 * n ������������� ����� N.*/
public class Exercise5 {

	public static void main(String[] args) {
		int chislo, a, b, c, d, e, f;
		double geometrSr, arifmSr;
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������������ �����:");
		chislo = in.nextInt();
		f = chislo % 10;
		e = ((chislo) / 10) % 10;
		d = (chislo / 100) % 10;
		c = (chislo / 1000) % 10;
		b = (chislo / 10000) % 10;
		a = (chislo / 100000);
		arifmSr = (a + b + c + d + e + f) / 6f;
		geometrSr = Math.pow((a * b * c * d * e * f), 1.0 / 6);
		System.out.println("�������������� ������� �����: " + arifmSr);
		System.out.println("�������������� ������� �����: " + geometrSr);

	}

}
