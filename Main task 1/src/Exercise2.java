import java.util.Scanner;

/*����� ��������� ������� � �����������. 
 * ������������ ���������, ������� ���������, ������� ��� ����������, ����� � ����.*/
public class Exercise2 {

	public static void main(String[] args) {
		int veight;
		float milliGrVeight, grVeight, tonnVeight;

		Scanner in = new Scanner(System.in);
		System.out.print("������� ����� ��������� � �����������: ");
		veight = in.nextInt();
		milliGrVeight = veight * 1000_000;
		grVeight = veight * 1000;
		tonnVeight = (veight / 1000f);
		System.out.format("����� ��������� � ������������: %.3f%n", milliGrVeight);
		System.out.format("����� ��������� � �������: %.3f%n", grVeight);
		System.out.format("����� ��������� � ������: %.3f%n", tonnVeight);

	}

}
