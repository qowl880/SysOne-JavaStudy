package Lambda;

interface A9{
	int[] abc(int len);
}

public class _9_RefOfArrayConstructor {
	public static void main(String[] args) {
		A9 a1 = new A9() {
			@Override
			public int[] abc(int len) {
				return new int[len];
			};
		};
		
		A9 a2 = len ->{
			return new int[len];
		};
		
		A9 a3 = int[]::new;
		
		int[] arr1 = a1.abc(3);
		System.out.println(arr1.length);
		
		int[] arr2 = a2.abc(3);
		System.out.println(arr2.length);
		
		int[] arr3 = a3.abc(3);
		System.out.println(arr3.length);
	}
}
