import java.util.*;

class JaggedArray {
	public static void main(String [] args) {
		int arr[][]=new int[3][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
