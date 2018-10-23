import java.util.Scanner;
/*Напишите программу, которая бы определяла, 
 * является ли введённая буква (символ) гласной 
 * (постарайтесь сделать минимум четырьмя способами,
 *  разрешается и больше).*/
public class Exercise3_2 {

	public static void main(String[] args) {
		String simvol;
		char letter, vowels;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите букву на латинице: ");
		simvol = in.nextLine();
		letter=simvol.charAt(0);
		if(letter==65 || letter==69 || letter==73 || 
				letter==79 ||letter==85 || letter==89) {
			System.out.println("Буква является гласной");
		}
		else if(letter==97 || letter==101 || letter==105 || 
				letter==111 ||letter==117 || letter==121) {
			System.out.println("Буква является гласной");
		}
		else System.out.println("Буква не является гласной");
		}
		
	}


