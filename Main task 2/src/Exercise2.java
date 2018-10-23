import java.util.Scanner;

/*) ¬ молодом возрасте дракон каждый год отращивает по три головы, 
 * но после того, как ему исполнитс€ 200 лет Ц только по две, 
 * а после 300 лет Ц лишь по одной. ѕредполагаетс€, что дракон 
 * по€вл€етс€ на свет сразу с трем€ головами. –азработайте программу, 
 * котора€ высчитывала бы, сколько голов и глаз у дракона, которому N лет?*/
public class Exercise2 {

	public static void main(String[] args) {
		int n, heads = 0, i = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите количество лет:");
		n = in.nextInt();
		if (n < 200) {
			heads = young(n);
		} else {
			if (n >= 200 && n < 300) {
				heads = mature(n);
				}
		}
		if (n >= 300) {
			heads = old(n);
		}
System.out.println("” дракона " + heads+ " голов и "+ heads*2+ " глаз");
	}

	static int young(int n) {
		int i = 0, heads = 0;
		while (i < n)

		{
			heads = heads + 3;
			i++;
		}
		return heads;
	}

	static int mature(int n) {
		int i = 0, heads = 0;
		while (i < 200) {
			heads = heads + 3;
			i++;
		}
		while (i <= n && i>=200) {
			heads = heads + 2;
			i++;
		}
		return heads;

	}

	static int old(int n) {
		int i = 0, heads = 0;
		while (i < 200) {
			heads = heads + 3;
			i++;
		}
		while (i >= 200 && i < 300) {
			heads = heads + 2;
			i++;
		}
		while (i >=300 && i<= n) {
			heads = heads + 1;
			i++;
		}
		return heads;

	}
}
