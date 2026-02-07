import java.util.Scanner;
class KilometersToMiles{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int kilometers = sc.nextInt();
		double miles = kilometers * 0.621371;
		System.out.println("The distance in miles are = "+miles);
	}
}