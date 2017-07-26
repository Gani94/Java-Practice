import java.util.Scanner;

public class BYTESM2 {
	
	static int rows, columns;
	static int[][] tiles;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();//number of test cases
		
		
		for(int i=0;i<T;i++){
		rows = sc.nextInt();
		columns = sc.nextInt();
		tiles = new int[rows][columns+2];
		for(int j=0;j<rows;j++){
			for(int k=1;k<=columns;k++){
				tiles[j][k]=sc.nextInt();
				
			}
		}

		
		
		for(int j=rows-2;j>=0;j--){
			for(int k=1;k<=columns;k++){
				tiles[j][k]=tiles[j][k]+Math.max(Math.max(tiles[j+1][k-1], tiles[j+1][k]),tiles[j+1][k+1]);
			}
		}
		
		int maxStones=0;
		for(int j=1;j<=columns;j++){
			if(tiles[0][j]>maxStones)
				maxStones=tiles[0][j];
		}
		
			
			System.out.println(maxStones);
		}
		
	}

}
