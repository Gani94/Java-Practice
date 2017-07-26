import java.util.Arrays;
import java.util.Scanner;

public class CheckPoints {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int[] x = new int[n];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			
		}
		Arrays.sort(x);
		int j = n/2, left=0, right=n;
		while(left!=right){
			if(x[j]<a){
				j=(j+right)/2;
				left=j;
			}
			else{
				j=j/2;
				right=j;
			}
		}
	}
}
