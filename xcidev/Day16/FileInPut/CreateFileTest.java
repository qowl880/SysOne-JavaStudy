package FileInPut;

import java.io.File;
import java.io.IOException;

public class CreateFileTest {
	public static void main(String[] args) throws IOException {
		File tempDir = new File("C:/dev/file/test");
		if(!tempDir.exists())
			tempDir.mkdirs();
		
		for(int i=0; i<5; i++) {
			int num = (int)(Math.random()*9999) + 1;
			String FileName = String.format("%04d", num);
			
			File newFile = new File("C:/dev/file/test/" + FileName + ".txt");
			System.out.println(newFile);
			if(!newFile.exists())
				newFile.createNewFile();
		}
		
		File tempDir2 = new File("C:/dev/file/test2");
		if(!tempDir2.exists())
			tempDir2.mkdir();
		
		File testFile = new File("C:/dev/file/test/");
		for(File file : testFile.listFiles()) {
			String newFileName = file.getName().replace(".txt", "");				// lastIndexOf를 통해 .을 찾아 바꾸기
			File newFile = new File("C:/dev/file/test2/" + newFileName);
			if(!newFile.exists())
				newFile.createNewFile();
		}
	}
}
