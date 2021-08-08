import java.util.*;
class AdditionArray{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n=s.nextInt();

		int a[] = new int[n];
		int sum=0;

		for(int i=0;i<n;i++){
			System.out.print("Enter the element "+(i+1)+" : ");
			a[i]=s.nextInt();
			sum=sum+a[i];
		}

		System.out.print("The sum of elements is : "+sum);
	}
}