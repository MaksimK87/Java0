
public class ProstoeChislo {
	public static void main(String[] args) {
		int chislo = 4;

		boolean isChisloSimple = true;
		for (int delitel = 2; delitel <= chislo/2; delitel++) {
			if (chislo % delitel == 0) {
				isChisloSimple = false;
				break;
			}
		}
		if (isChisloSimple) {
			System.out.println(chislo + " простое число");
		} else {
			System.out.println(chislo + " не является простым");
		}

	}

	
}
