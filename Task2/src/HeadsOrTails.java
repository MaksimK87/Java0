/*���������� �������� ��������� �Heads or Tails?� (���� ��� �����?�), 
 * ������� �� ������������� ������� ������, � �������, 1000 ��� � ��������, 
 * ������� ��� ����� ���, � ������� � �����.*/
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
		System.out.println("����� ������ " + tail + " ���");
		System.out.println("���� ����� " + head + " ���");

	}

}
