import java.util.Scanner;

/*) �������� ���������, ������� �������������� (�����������) 
 * ����������� ����� N (� �������, ����� 1234567 ������������� 
 * � ����� 7654321).*/
public class Exercise6 {

	public static void main(String[] args) {
		int chislo, revChislo = 0, delitel = 1, i = 0, j = 0;
		int memory[] = new int[7];
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����������� �����:");
		chislo = in.nextInt();
		while (chislo != 0) {
			if (delitel == 1000000) {
				memory[i] = (chislo / delitel);
				break;
			}
			memory[i] = (chislo / delitel) % 10;
			i++;
			delitel = delitel * 10;
		}
		while (delitel != 0) {

			revChislo = revChislo + memory[j] * delitel;
			delitel = delitel / 10;
			j++;

		}
		System.out.println("�������� �����: " + revChislo);

	}

}
