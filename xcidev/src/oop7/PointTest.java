package oop7;

public class PointTest {
	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		p1.x = 100;
		p1.y = 200;
		
		// UpCasting
		Point2D p2 = new Point3D();
		p2.x = 100;
		p2.y = 200;
//		p2.z = 300;		에러 발생
		
		// DownCasting : 원래 본인의 객체로 생성했던 것을 upcasting했던 것만을 downcasting 가능함
		Point3D p3 = (Point3D) p2;
		p3.x = 1000;
		p3.y = 2000;
		p3.z = 3000;
		
		Point3D p4 = new Point3D();
		p4.x = 1000;
		p4.y = 2000;
		p4.z = 3000;
		
	}
}
