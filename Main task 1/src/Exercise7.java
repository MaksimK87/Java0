import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.println("������� a:");
		a = in.nextInt();
		System.out.println("������� b:");
		b = in.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("����� � �����: " + a + ", ����� b �����: " + b);

	}

}
