import java.util.Scanner;
class MatrixAddition{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of row : ");
		int m=s.nextInt();
		System.out.print("Enter the number of column : ");
		int n=s.nextInt();
		
		int a[][] = new int[m][n];

		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
			System.out.print("Enter the ["+(i+1)+"]["+(j+1)+"] : ");
			a[i][j] = s.nextInt();				
			}
		}

		System.out.print("\nThe Matrix is:- \n");

		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
			System.out.print(" \t"+a[i][j]);		
			}
			System.out.println();
		}
		
	}
}