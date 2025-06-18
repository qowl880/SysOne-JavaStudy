package importTest;

import importTest2.A;

public class PackageImport_2 {
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
}
