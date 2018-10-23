import java.util.Scanner;

/*На прямоугольной декартовой системе координат на плоскости заданы три точки 
 * с соответствующими координатами в виде пары значений (x,y). 
 * Определить, являются ли данные точки вершинами треугольника. 
 * И если да, то дополнительно определить, 
 * является ли данный треугольник прямоугольным.*/
public class Exercise1 {

	public static void main(String[] args) {
		int x1=0, x2=0, x3=0, y1=0, y2=0, y3=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите x1,x2,x3: ");
		x1 = in.nextInt();
		x2 = in.nextInt();
		x3 = in.nextInt();
		System.out.println("Введите y1,y2,y3: ");
		y1 = in.nextInt();
		y2 = in.nextInt();
		y3 = in.nextInt();
		if(((x3-x1)/(x2-x1))==((y3-y1)/(y2-y1))) {
			System.out.println("Данные точки не являются вершинами треугольника");
		}
			else {
				if((Math.pow((x2-x1),2)+Math.pow(y2-y1, 2)+Math.pow((x2-x3),2)+Math.pow(y2-y3, 2)==
						Math.pow((x3-x1),2)+Math.pow(y3-y1, 2))||
						(Math.pow((x2-x1),2)+Math.pow(y2-y1, 2)+Math.pow((x3-x1),2)+Math.pow(y3-y1, 2)==
						Math.pow((x2-x3),2)+Math.pow(y2-y3, 2))||
						(Math.pow((x3-x1),2)+Math.pow(y3-y1, 2)+Math.pow((x3-x2),2)+Math.pow(y3-y2, 2)==
						Math.pow((x2-x1),2)+Math.pow(y2-y1, 2))
						) {
					System.out.println("Данные точки являются вершинами прямоугольного треугольника");
				}
				else {
					System.out.println("Данные точки являются вершинами треугольника");
				}
			}
		}

	}


