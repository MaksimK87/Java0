
public class UltimateNumber {

	public static void main(String[] args) {
		int naturalNumber, delitel, sumUltimateNum = 0;
		naturalNumber = 8128;
		for (delitel = 1; delitel <= naturalNumber / 2; delitel++) {
			if (naturalNumber % delitel == 0) {
				sumUltimateNum = sumUltimateNum + delitel;
			}
		}
		if (naturalNumber == sumUltimateNum) {
			System.out.println("Число " + naturalNumber + " является совершенным");
		} else {
			System.out.println("Число " + naturalNumber + " не является совершенным");
		}

	}
}
