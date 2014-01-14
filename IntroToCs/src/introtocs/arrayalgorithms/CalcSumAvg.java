package introtocs.arrayalgorithms;

public class CalcSumAvg {

	public static void main(String[] args) {
		// calculating the sum and average of integer values
		
		int[] nums = { 5, 10, 15, 20, 25 };
		
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		
		avg = sum / (nums.length);
		
		System.out.println("Sum: " + sum);
		System.out.println("Avg: " + avg);
		
	}

}
