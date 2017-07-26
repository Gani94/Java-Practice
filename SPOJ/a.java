import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter area");
//		int area = sc.nextInt();
//		
//		double length, width;
//		double v = 0;
//		for(length=2;length<area/2;length++){
//			width = area/length;
//			double temp = volume(length,width);
//			if(v<temp)
//				v=temp;
//		}
//		
//		System.out.println(v);
		
		int[] nums = {5,4,6,7,9,3,10,9,5,6};
		ArrayList<Integer> ans = findDuplicates(nums);
		
	}

	private static double volume(double length, double width) {
		// TODO Auto-generated method stub
		double temp1 = (length*length+width*width-length*width);
		temp1 = Math.sqrt(temp1);
		temp1 = length+width-temp1;
		temp1/=6;
		
		double volume = (length-2*temp1)*(width-2*temp1)*temp1;
		return volume;
	}
	
	
	
	    public static ArrayList<Integer> findDuplicates(int[] nums) {
	        int size = nums.length;
	        ArrayList<Integer> duplicates = new ArrayList<Integer>();
	        for(int i=0;i<size;i++){
	            if(nums[i]==i+1)
	                continue;
	            if(nums[nums[i]-1]==nums[i])
	                duplicates.add(nums[i]);
	            else{
	                int temp = nums[i];
	                nums[i]  = nums[nums[i]-1];
	                nums[temp-1]=temp;
	            }
	        }
	        return duplicates;
	    }
	
	
	
}
