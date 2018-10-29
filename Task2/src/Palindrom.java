/* проверить, является ли заданное натуральное число палиндромом;*/
public class Palindrom {

	public static void main(String[] args) {
		int sluchaynoeChislo;
		for (int i = 0; i < 100; i++) {
			sluchaynoeChislo = (int) (Math.random()*100000);
			if (isPolindrom(sluchaynoeChislo)) {
				System.out.println(sluchaynoeChislo + " является полиндромом !!!!");
			} else
				System.out.println(sluchaynoeChislo + " не является палиндромом");

		}
	}

	private static boolean isPolindrom(int number) {
		int digits = digitsInNumber(number); // находим количество цифр в числе
		if (digits == 1) {
			return true;
		}
		for (int i = 0; i <= digits / 2 + 1; i++) {  // определяем, является ли число палиндромом
			if (findDititByIndex(number, i) != findDititByIndex(number, digits - i - 1)) {
				return false;
			}
		}
		return true;

	}

	private static int digitsInNumber(int number) {
		int counter = 0;
		if (number == 0) {
			return 1;
		}
		while (number != 0) {
			number = number / 10;
			counter++;
		}
		return counter;
	}

	private static int findDititByIndex(int number, int index) {
		number = number / (int) (Math.pow(10, index));

		return number % 10;
	}

}
