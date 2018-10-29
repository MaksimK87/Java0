import java.util.Scanner;

public class simpleDelitel {

	public static void main(String[] args) {
		int chislo = 25698, delitelSimple;
		if (simpleDelitel(chislo)) {
			System.out.println(chislo + " является простым числом");
		}
		for (delitelSimple = 2; delitelSimple <= chislo/2; delitelSimple++) {
			if (chislo % delitelSimple == 0) {
					if (simpleDelitel(delitelSimple)) {
					System.out.println(delitelSimple + " "
							+ "простой " + "делитель числа " + chislo);
				}
			}
		}
	}

	static boolean simpleDelitel(int chislo) {
		boolean isChisloSimple = true;
		for (int delitel = 2; delitel <= chislo / 2; delitel++) {
			if (chislo % delitel == 0) {
				isChisloSimple = false;
				break;
			}
		}
		return isChisloSimple;

	}
}
