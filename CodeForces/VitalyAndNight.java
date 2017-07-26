import java.util.Scanner;

public class VitalyAndNight {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int floors = sc.nextInt();
		int flats  = sc.nextInt();
		int awake  = 0;
		for(int i=0;i<floors;i++){
			for(int j=0;j<flats;j++){
				if(sc.nextInt()+sc.nextInt()>0)
					awake++;
			}
		}
		System.out.println(awake);
	}

}
