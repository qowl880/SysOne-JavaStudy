package Generic;

class Apple{
	
	public String toString() {
		return "Apple 입니다";
	}
	
}
class Goods1{
	private Apple apple;
	public Apple getApple() {
		return apple;
	}
	
	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

class Pencil{
	public String toString() {
		return "Pencil 입니다";
	}
	
}
class Goods2{
	private Pencil pencil;
	public Pencil getPencil() {
		return pencil;
	}
	
	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}


public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple());
		Apple apple = goods1.getApple();
		apple.toString();
		
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil());
		Pencil pencil = goods2.getPencil();
		pencil.toString();
	}
}
