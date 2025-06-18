package practice;

class A4{
	void averageScore(int ...num){
		double avg = 0;
		for(int i : num) {
			avg += i;
		}
		
		System.out.println(avg/num.length);
	}
}

public class Seven_five {
	public static void main(String[] args) {
		A4 a = new A4();
		a.averageScore(1);
		a.averageScore(1,2);
		a.averageScore(1,2,3);
		a.averageScore(1,2,3,4);
	}
}
