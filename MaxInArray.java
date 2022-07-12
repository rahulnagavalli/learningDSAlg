package ds;

public class MaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,7,1,10};
		int max = maxElement(arr);
		System.out.println("Element with max value is: " +  max);
	}
	
	public static int maxElement(int[] arr) {
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

}
