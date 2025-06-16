package overloadandoverriding;


class A1{
	protected void abc() {}
}

class B1 extends A1{
	public void abc() {}
}

class B2 extends A1{
	protected void abc() {}
}

class B3 extends A1{
//	 void abc(){}		default는 protected보다 허용하는 범위가 좁아져서 불가능
}

class B4 extends A1{
//	private void abc() {}		private는 protected보다 허용하는 범위가 좁아져서 불가능
}

public class MethodOverriding_4 {
	public static void main(String[] args) {
		
	}
}
