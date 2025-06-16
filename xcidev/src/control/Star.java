package control;

public class Star {
	public static void main(String[] args) {
		int i = 1;
		while(i<=5) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("=========");
		
		int a = 5;
		while(a>=1) {
			int j=1;
			while(j<=a) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			a--;
		}
		
		System.out.println("=========");
		
		i = 1;
		while(i<=5) {
			int j=1;
			while(j<=6-i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("=========");
		
		i = 1;
		while(i<=5) {
			int j=1;
			while(j<=5) {
				if(j <= i )	System.out.print("*");
				else System.out.print(" ");

				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("=========");
		
		i = 5;
		while(i>=1) {
			int j=1;
			while(j<=5) {
				if(i <= j)	System.out.print("*");
				else System.out.print(" ");

				j++;
			}
			System.out.println();
			i--;
		}
		
		System.out.println("=========");
		
		i = 1;
		while(i<=5) {
			int j=1;
			while(j<=5) {
				if(i >= 6-j)	System.out.print("*");
				else System.out.print(" ");

				j++;
			}
			System.out.println();
			i++;
		}
	}
}


