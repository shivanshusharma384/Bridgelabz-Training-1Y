import java.util.Scanner;
class AreaOfCircle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		double area = (Math.PI * radius * radius);
		System.out.println("The Area of the circle is = "+area);
	}
}