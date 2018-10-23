import java.util.Scanner;

/*На плоскости даны два круга с общим центром и радиусами R1 и R2 (R1 > R2). 
 * Разработайте программу нахождения площади кольца, 
 * внешний радиус которого равен R1, а внутренний радиус равен R2.*/

public class Exercise3 {

	public static void main(String[] args) {
		double R1, R2, S1, S2,S;
		double pi=Math.PI;

		Scanner in = new Scanner(System.in);
		System.out.print("Введите внешний радиус кольца R1: ");
		R1 = in.nextInt();
		System.out.print("Введите внутренний радиус кольца R2: ");
		R2 = in.nextInt();
		if (R1 < R2) {
			System.out.println("Введены неверные значения радиуса, условие - R1>R2!");
		}
		else {
		S1= pi*R1*R1;
		S2=pi*R2*R2;
		S=S1-S2;
		System.out.format("Площадь кольца равна: %.3f%n" ,S);
		}

	}
}
