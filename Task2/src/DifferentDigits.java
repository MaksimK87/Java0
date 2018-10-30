
public class DifferentDigits {

	public static void main(String[] args) {
		int naturalNumber;
		naturalNumber = (int) (Math.random() * 100000);
		System.out.println(naturalNumber);
		findDifferNumb(naturalNumber); // find different digits

	}

	static void findDifferNumb(int naturalNumber) {
		int counter = 0, wholeNumber, partOfNumber;
		for (int digit = 0; digit < 10; digit++) {
			wholeNumber = naturalNumber;
			partOfNumber = wholeNumber % 10;
			while ((wholeNumber /= 10) != 0) {
				if (partOfNumber == digit) {
					counter++;
					break;
				}

				partOfNumber = wholeNumber % 10;
				if (partOfNumber == digit) {
					counter++;
					break;
				}

			}
		}
		System.out.println("Количество различных цифр натуральнoго числа: " + (counter));
	}
}
