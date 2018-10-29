/*Необходимо написать программу «Heads or Tails?» («Орёл или решка?»), 
 * которая бы «подбрасывала» условно монету, к примеру, 1000 раз и сообщала, 
 * сколько раз выпал орёл, а сколько – решка.*/
public class HeadsOrTails {

	public static void main(String[] args) {
		int tail = 0, head = 0, probability;
		for (int i = 0; i < 1000; i++) {
			probability = (int) (Math.random() * 1000);
			if (probability <= 500) {
				tail++;
			} else {
				head++;
			}
		}
		System.out.println("Решка выпала " + tail + " раз");
		System.out.println("Орел выпал " + head + " раз");

	}

}
