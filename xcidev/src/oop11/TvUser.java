package oop11;

import java.io.FileInputStream;
import java.util.Properties;

public class TvUser {
	public static void main(String[] args) throws Exception{
		
		/*
		 * 해당 과정은 Spring에서 DI 의존성 주입과 같은 역할임
		 */
		/*
		 * 원래는 TV tv = new SamsungTV(), TV tv = new LGTV() 처럼 각 객체를 생성해서 사용했는데
		 * 아래와 같이 외부 설정파일에서 TV의 값을 받아와 새로운 객체를 생성해 주면 외부 설정파일에서 값만 변경해도 출력이 됨
		 * 이렇게 하게 되면 기존에는 new SamsungTV()처럼 객체의 생성자를 작성하여 Samsung()객체만 사용하겠다는 의존적이 되버린다.
		 * 이를 방지하기 위해 new 자체를 삭제하고 다른 방법을 사용하여 의존성을 낮출 수 있다.
		 */
		
		// 외부 설정 파일 읽어오기
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/oop11/product.properties"));
		// product.properties에 있는 tv 값 가져옴
		String tvName = prop.getProperty("tv");
		// 실제로 해당 값이 src/oop11에 존재하는지 확인
		Class tvClass = Class.forName(tvName);
		String speakerName = prop.getProperty("speaker");
		Class speakerClass = Class.forName(speakerName);
		
		TV tv = (TV) tvClass.getConstructor().newInstance();	// new SamsungTv()
		tv.setSpeaker((Speaker)speakerClass.getConstructor().newInstance());
		
		
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.powerOff();
	}
}
