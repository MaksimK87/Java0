
public class OperationsWithNaturalNumber {

	public static void main(String[] args) {
		int naturalNumber;
		naturalNumber = (int) (Math.random() * 100000);
		System.out.println(naturalNumber);
		theBiggestNumber(naturalNumber); // ������� ���������� ����� ������������ �����

	}

	static int theBiggestNumber(int naturalNumber) {
		int powerNumb1 = 0, a = 0, b = 0, theBiggest = 0;
		int number = naturalNumber;
		while (number != 0) {// ������� ���������� ���� � �����
			number = number / 10;
			powerNumb1++;
		}
		for (int pow = 0; pow < powerNumb1;) {
			a = (int) ((naturalNumber / Math.pow(10, pow)) % 10); // ���������� ����� ��������
			pow++;
			if (powerNumb1 < pow) {
				break;
			}
			b = (int) ((naturalNumber / Math.pow(10, pow)) % 10);
			pow++;
			if (theBiggest < a) { // ���� ���������� �����
				theBiggest = a;
			}

			if (theBiggest < b) {
				theBiggest = b;
			}

		}
		System.out.println("���������� ����� ���������o�� ����� - " + theBiggest);
		return theBiggest;
	}
}
