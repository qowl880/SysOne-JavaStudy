package DataStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//#File 객체 생성
		File outFile1 = new File("Day16/DataStream/PrintStream1.txt");
		File outFile2 = new File("Day16/DataStream/PrintStream2.txt");
		
		//#1. PrintStream(FileOutputStream(File))
		try(OutputStream os1 = new FileOutputStream(outFile1);
			PrintStream ps = new PrintStream(os1);){
			
			ps.println(5.8);
			ps.print(3+ " 안녕 "+ 12345 + "\n");
			ps.printf("%d ", 7).printf("%s %f", "안녕", 5.8);
			ps.println();
		} catch(IOException e) {}
		
		//#2. PrintStream(File)		- 기본적인 파일 출력할때는 2번 방법이 좋음
		try(PrintStream ps = new PrintStream(outFile2);){
			
			ps.println(5.8);
			ps.print(3+ " 안녕 "+ 12345 + "\n");
			ps.printf("%d ", 7).printf("%s %f", "안녕", 5.8);
			ps.println();
		} catch(IOException e) {}
		
		//#3. PrintStream ps = System.out
		try(OutputStream os2 = System.out;
			PrintStream ps = new PrintStream(os2)){
			
			ps.println(5.8);
			ps.print(3+ " 안녕 "+ 12345 + "\n");
			ps.printf("%d ", 7).printf("%s %f", "안녕", 5.8);
			ps.println();
		} catch(IOException e) {}
		
		
	}
}