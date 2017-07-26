import java.util.Scanner;

public class Juicer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int d = sc.nextInt();
		int[] a = new int[n];
		
		int count=0, trashSum=0;
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(a[i]<=b)
				trashSum+=a[i];
			while(trashSum>d){
				trashSum=0;
				count++;
			}
		}
		System.out.println(count);
	}
}
