import java.util.Scanner;

/*�������� ���������, ������� �� ����������, 
 * �������� �� �������� ����� (������) ������� 
 * (������������ ������� ������� �������� ���������,
 *  ����������� � ������).*/
public class Exercise3_1 {

	public static void main(String[] args) {
		String simvol;
		int index=0;
		char letter;
		char [] vowels= {'a','e','i','o','u','y','A','E','I','O','U','Y'};
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� �� ��������: ");
		simvol = in.nextLine();
		letter=simvol.charAt(0);
		for(int i=0;i<vowels.length;i++) {
			if(letter==vowels[i]) {
			 index=i;
			}
			if(letter==vowels[index])
				System.out.println("��������� ������ �������� �������");
			else 
				System.out.println("��������� ������ �� �������� �������");
		}
		
		
	}

}
