import java.util.Scanner;

/*������������ ���������, ������� ���������, ��� ����� �������������� ����� N 
 * �������� ������������ (���������) ������������������ 
 * (� �������, ����� 1357 ������������� �������, �.�. ��� ����� ������������� 
 * ���������� �����������: 1 < 3 < 5 < 7, �.�. ���� � ������� �����������).*/

public class Exercise4 {

	public static void main(String[] args) {
		int chislo, a, b, c, d;
		Scanner in = new Scanner(System.in);
		System.out.println("������� �������������� �����:");
		chislo = in.nextInt();
		d = chislo % 10;
		c = ((chislo) / 10) % 10;
		b = (chislo / 100) % 10;
		a = chislo / 1000;
		if (a < b && b < c && c < d) {
			System.out.println("����� ���������� ����� �������� ������������ ������������������");

		} else {
			if (a == b && b == c && c == d) {
				System.out.println("����� ����� �����");
			} else {
				if (a > b && b > c && c > d)
					System.out.println("����� ����� �������� ��������� ������������������");
			}

		}

	}

}
