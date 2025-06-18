package array;

public class ValueAssignment {
	public static void main(String[] args) {
		
		int[] arr  = new int[3];
		arr[0] = 3;
		arr[1] = 4;
		arr[2] = 5;
		
		System.out.println(arr[0] + " " + arr[1] + " "+ arr[2]);
		
		
		int[] arr2;
		arr2 = new int[3];
		arr2[0] = 3;
		arr2[1] = 4;
		arr2[2] = 5;
		System.out.println(arr2[0] + " " + arr2[1] + " " + arr2[2]);
		
		int[] arr3 = new int[] {3,4,5};
		System.out.println(arr3[0] + " " + arr3[1] + " " + arr[2]);
		
		int[] arr4;
		arr4 = new int[] {3,4,5};
		System.out.println(arr4[0] + " "+ arr4[1]+ " "+ arr4[2]);
		
		int[] arr5 = {3,4,5};
		System.out.println(arr5[0] + " "+ arr5[1] + " "+ arr5[2]);
	} 
}
