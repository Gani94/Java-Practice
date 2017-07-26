import java.util.Scanner;

public class TWEED {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++){
			int n = sc.nextInt();
			String first = sc.next();
			int[] a = new int[n];
			for(int j=0;j<n;j++){
				a[j] = sc.nextInt();
			}
			if(n==1 && first.equals("Dee")){
				if(a[0]%2==0)
					System.out.println("Dee");
				else
					System.out.println("Dum");
			}
			else
				System.out.println("Dum");
		}
	}
}
