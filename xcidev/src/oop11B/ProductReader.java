package oop11B;

import java.io.FileInputStream;
import java.util.Properties;

public class ProductReader {
	// simple foactory pattern을 구조안에서 설정값을 읽기 위한 유틸리티 클래스
	private static Properties props = new Properties();
	
	static {
		try {
			// src/oop11b/product.properties 해당 경로에서 파일 input을 받음
			props.load(new FileInputStream("src/oop11b/product.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getValue(String key) {
		
		return props.getProperty(key);
	}
}
