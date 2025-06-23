package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class A2{
	int data;
	public A2(int data) {
		this.data = data;
	}
}

class B2{
	int data;
	public B2(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B2) {
			if(this.data == ((B2) obj).data) {
			return true;
			}
		}
		
		return false;
	}
}

class C2{
	int data;
	public C2(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C2) {
			if(this.data == ((C2)obj).data) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data);
	}
}

public class HashMapMachanism {
	public static void main(String[] args) {
		// 1. 어떤 것도 오버라이딩하지 않음
		Map<A2, String> hashMap1 = new HashMap<>();
		A2 a1 = new A2(3);
		A2 a2 = new A2(3);
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode() + ", "+a2.hashCode());
		hashMap1.put(a1,  "첫번째");
		hashMap1.put(a2,  "첫번째");
		System.out.println(hashMap1.size());
		System.out.println();
		
		// 2. equals 메서드만 오버라이딩
		Map<B2, String> hashMap2 = new HashMap<>();
		B2 b1 = new B2(3);
		B2 b2 = new B2(3);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode() + ", "+b2.hashCode());
		hashMap2.put(b1, "첫 번째");
		hashMap2.put(b2, "두 번째");
		System.out.println(hashMap2.size());
		System.out.println();
		
		// 3. equals + hashCode 메서드 오버리이딩
		Map<C2, String> hashMap3 = new HashMap<>();
		C2 c1 = new C2(3);
		C2 c2 = new C2(3);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode() + ", "+c2.hashCode());
		hashMap3.put(c1, "첫 번째");
		hashMap3.put(c2, "두 번째");
		System.out.println(hashMap3.size());
		System.out.println();
	}
}
