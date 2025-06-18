package array;

public class PrimaryAndReferenceType {
	public static void main(String[] args) {
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println();
		
		int[] arr1 = new int[] {3,4,5};
		int[] arr2 = arr1;
		arr2[0] = 7;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
	}
}
