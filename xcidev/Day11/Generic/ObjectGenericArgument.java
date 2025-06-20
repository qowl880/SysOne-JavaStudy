package Generic;

class Apple2{}
class Pencil2{}

class Goods<T>{
	private T t;
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	
}

public class ObjectGenericArgument {
	public static void main(String[] args) {
		Goods<Apple2> goods1 = new Goods<>();
		goods1.set(new Apple2());
		Apple2 apple = goods1.get();
		
		Goods<Pencil2> goods2 = new Goods<>();
		goods2.set(new Pencil2());
		Pencil2 pencil = goods2.get();
		
		
	}
}
