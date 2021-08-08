import java.util.Scanner;
class BuyPlease{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.print(" "+(a*x+b*y));
	}
}