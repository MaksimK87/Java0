import java.util.Scanner;

/*Масса динозавра задаётся в килограммах. 
 * Разработайте программу, которая вычисляет, сколько это миллиграмм, грамм и тонн.*/
public class Exercise2 {

	public static void main(String[] args) {
		int veight;
		float milliGrVeight, grVeight, tonnVeight;

		Scanner in = new Scanner(System.in);
		System.out.print("Введите массу динозавра в килограммах: ");
		veight = in.nextInt();
		milliGrVeight = veight * 1000_000;
		grVeight = veight * 1000;
		tonnVeight = (veight / 1000f);
		System.out.format("Масса динозавра в миллиграммах: %.3f%n", milliGrVeight);
		System.out.format("Масса динозавра в граммах: %.3f%n", grVeight);
		System.out.format("Масса динозавра в тоннах: %.3f%n", tonnVeight);

	}

}
