package sec02_fileinputoutputstream.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {
		// 입력 파일 생성
		File outFile = new File("Day16/sec02_fileinputoutputstream/files/FileOutput-Stream1.txt");

		try (OutputStream os1 = new FileOutputStream(outFile);
				OutputStream os2 = new FileOutputStream(outFile, true);
				OutputStream os3 = new FileOutputStream(outFile, true)) {		// false인 경우 기존 파일 덮어씌움

			// 1. byte 단위 쓰기
			os1.write('J');
			os1.write('A');
			os1.write('V');
			os1.write('A');
			os1.write('\r'); // 문자열 맨 앞으로 이동
			os1.write('\n'); // 한줄 밑으로 이동 // 2개가 합쳐서 Enter 역할
			os1.flush();
			
			// 2. n-byte
			byte[] byteArray1 = "Hello!".getBytes();
			os2.write(byteArray1);
			os2.write('\n');
			os2.flush();
			
			// 3. n-byte 단위 쓰기

			byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
			os3.write(byteArray2, 7, 8);
			os3.flush();
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
}
