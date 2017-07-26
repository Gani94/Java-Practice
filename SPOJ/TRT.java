import java.util.Arrays;
import java.util.Scanner;

public class TRT {

	static int[][] profits;
	static int N;
	static int[] values;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.nextLine();
		values = new int[N];
		for(int i=0;i<N;i++){
			values[i]= sc.nextInt();
			sc.nextLine();
		}
		 profits = new int[N][N];
//		 for(int i=0;i<N;i++){
//		      for(int j=0;j<N;j++){
//		        profits[i][j] = -1;
//		      }
//		    }
		
		int maxProfit = maxProfit(0,N-1);
		System.out.println(maxProfit);
	}
	
	private static int maxProfit(int i, int j) {
		// TODO Auto-generated method stub
		if(i>j)
			return 0;
		int year = N-(j-i);
		if(profits[i][j]!=0)
		return profits[i][j];
		return profits[i][j]=Math.max(maxProfit(i+1,j)+year*values[i], maxProfit(i,j-1)+year*values[j]);
		//return profits[i][j];
	}

	
}