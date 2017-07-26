import java.util.Scanner;

public class TheChildAndHomework {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] answers = new int[4];
		String option;
		int min=Integer.MAX_VALUE, max = 0, minIndex=0, maxIndex=0;
		for(int i=0;i<4;i++){
			option = sc.nextLine();
			answers[i] = option.length()-2;
			if(min>answers[i]){
				min=answers[i];
				minIndex=i;
			}
			if(max<answers[i]){
				max=answers[i];
				maxIndex=i;
			}
		}
		
		int longer=0, shorter=0;
		for(int i=0;i<4;i++){
			if(answers[i]>=2*min)
				shorter++;
			if(max>=2*answers[i])
				longer++;
		}
		int answer;
		if(longer==3){
			if(shorter==3)
				answer=2;
			else
				answer=maxIndex;
		}
		else{
			if(shorter==3)
				answer=minIndex;
			else
				answer=2;
		}
		
		answer+=65;
		System.out.println(Character.toString((char) answer));
		
	}
}
