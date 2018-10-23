import java.util.Scanner;

/*) � ������� �������� ������ ������ ��� ���������� �� ��� ������, 
 * �� ����� ����, ��� ��� ���������� 200 ��� � ������ �� ���, 
 * � ����� 300 ��� � ���� �� �����. ��������������, ��� ������ 
 * ���������� �� ���� ����� � ����� ��������. ������������ ���������, 
 * ������� ����������� ��, ������� ����� � ���� � �������, �������� N ���?*/
public class Exercise2 {

	public static void main(String[] args) {
		int n, heads = 0, i = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("������� ���������� ���:");
		n = in.nextInt();
		if (n < 200) {
			heads = young(n);
		} else {
			if (n >= 200 && n < 300) {
				heads = mature(n);
				}
		}
		if (n >= 300) {
			heads = old(n);
		}
System.out.println("� ������� " + heads+ " ����� � "+ heads*2+ " ����");
	}

	static int young(int n) {
		int i = 0, heads = 0;
		while (i < n)

		{
			heads = heads + 3;
			i++;
		}
		return heads;
	}

	static int mature(int n) {
		int i = 0, heads = 0;
		while (i < 200) {
			heads = heads + 3;
			i++;
		}
		while (i <= n && i>=200) {
			heads = heads + 2;
			i++;
		}
		return heads;

	}

	static int old(int n) {
		int i = 0, heads = 0;
		while (i < 200) {
			heads = heads + 3;
			i++;
		}
		while (i >= 200 && i < 300) {
			heads = heads + 2;
			i++;
		}
		while (i >=300 && i<= n) {
			heads = heads + 1;
			i++;
		}
		return heads;

	}
}
