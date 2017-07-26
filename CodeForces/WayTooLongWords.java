import java.util.Scanner;

public class WayTooLongWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		String input, output;
		int length;
		for(int i=0;i<testcases;i++){
			input = sc.next();
			length = input.length();
			if(length>10){
				length-=2;
				output = input.charAt(0)+String.valueOf(length)+input.charAt(length+1);
			}
			else
				output = input;
			System.out.println(output);
				
		}
	}
}
