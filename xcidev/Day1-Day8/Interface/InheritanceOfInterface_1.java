package Interface;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack2.C;

interface A1 {}

interface B1 {}

class C1 implements A1{
	
}

class D1 implements A1, B1{
	
}

class E1 extends C implements A1,B1{
	
}

public class InheritanceOfInterface_1 {
	public static void main(String[] args) {
		
	}
}
