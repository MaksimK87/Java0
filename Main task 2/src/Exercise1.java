import java.util.Scanner;

/*�� ������������� ���������� ������� ��������� �� ��������� ������ ��� ����� 
 * � ���������������� ������������ � ���� ���� �������� (x,y). 
 * ����������, �������� �� ������ ����� ��������� ������������. 
 * � ���� ��, �� ������������� ����������, 
 * �������� �� ������ ����������� �������������.*/
public class Exercise1 {

	public static void main(String[] args) {
		int x1=0, x2=0, x3=0, y1=0, y2=0, y3=0;
		Scanner in = new Scanner(System.in);
		System.out.println("������� x1,x2,x3: ");
		x1 = in.nextInt();
		x2 = in.nextInt();
		x3 = in.nextInt();
		System.out.println("������� y1,y2,y3: ");
		y1 = in.nextInt();
		y2 = in.nextInt();
		y3 = in.nextInt();
		if(((x3-x1)/(x2-x1))==((y3-y1)/(y2-y1))) {
			System.out.println("������ ����� �� �������� ��������� ������������");
		}
			else {
				if((Math.pow((x2-x1),2)+Math.pow(y2-y1, 2)+Math.pow((x2-x3),2)+Math.pow(y2-y3, 2)==
						Math.pow((x3-x1),2)+Math.pow(y3-y1, 2))||
						(Math.pow((x2-x1),2)+Math.pow(y2-y1, 2)+Math.pow((x3-x1),2)+Math.pow(y3-y1, 2)==
						Math.pow((x2-x3),2)+Math.pow(y2-y3, 2))||
						(Math.pow((x3-x1),2)+Math.pow(y3-y1, 2)+Math.pow((x3-x2),2)+Math.pow(y3-y2, 2)==
						Math.pow((x2-x1),2)+Math.pow(y2-y1, 2))
						) {
					System.out.println("������ ����� �������� ��������� �������������� ������������");
				}
				else {
					System.out.println("������ ����� �������� ��������� ������������");
				}
			}
		}

	}


