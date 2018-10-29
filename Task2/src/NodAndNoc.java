
public class NodAndNoc {

	public static void main(String[] args) {
		int chisloA = 12, chisloB = 9, nodnumb;
		nodnumb = nod(chisloA, chisloB);

		System.out.println("мнд - " + nodnumb);

		System.out.println("мнй - " + (noc(chisloA, chisloB, nodnumb)));
	}

	static int nod(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		return a + b;

	}

	static int noc(int a, int b, int nod) {
		return (a * b) / nod;

	}
}
