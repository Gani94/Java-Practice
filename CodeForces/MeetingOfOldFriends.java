import java.util.Scanner;

public class MeetingOfOldFriends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l1 = sc.nextInt();
		int r1 = sc.nextInt();
		int l2 = sc.nextInt();
		int r2 = sc.nextInt();
		int k  = sc.nextInt();
		
		int timeRange=0;
		if(r1<l2 || r2<l1)
			System.out.println(timeRange);
		else{
				int upperLimit = Math.min(r1, r2);
				int lowerLimit = Math.max(l1, l2);
				timeRange = upperLimit-lowerLimit+1;
				if(lowerLimit<=k && upperLimit>=k)
					timeRange--;
				
			System.out.println(timeRange);
				
		}
	}
}
