package control.practice;

public class Four {
	public static void main(String[] args) {
		for(int i =0; ; i++) {
			if(i == 11) break;
			if(i %2 != 0)continue;
			System.out.println(i);
		}
	}
}
