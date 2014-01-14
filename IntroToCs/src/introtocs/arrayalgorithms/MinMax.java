package introtocs.arrayalgorithms;

public class MinMax {

	public static void main(String[] args) {
		// Finding a min or max value
		
		int[] nums = { 20, 4, 33, 101, 14, 76 };
		
		int currMax = nums[0];
		int currMin = nums[0];
		
		for (int i = 1; i < nums.length - 1; i++) {
			if (currMax < nums[i]) {
				currMax = nums[i];
			}
			if (currMin > nums[i]) {
				currMin = nums[i];
			}
		}
		
		System.out.println(currMax);
		System.out.println(currMin);

	}

}
