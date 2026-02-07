import java.util.Scanner;
class SimpleInterest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt();
		double rate = sc.nextDouble();
		double time = nextDouble();
		double si = (principal * rate * time)/100;
		System.out.println("The Simple Interest is = "+si);
	}
}