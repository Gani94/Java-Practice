import java.util.Scanner;

public class PineappleIncident {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//start time
		int s = sc.nextInt();//interval
		int x = sc.nextInt();//target
		if(x==t)
			System.out.println("YES");
		else{
			x=x-t;
			if(x<s)
				System.out.println("NO");
			else
				if(x%s==0||x%s==1)
					System.out.println("YES");
				else
					System.out.println("NO");
			
		}
		
	}
}
