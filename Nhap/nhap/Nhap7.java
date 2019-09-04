package nhap;

import java.io.File;
import java.io.IOException;

public class Nhap7 {
	public static void main(String[] args) {
		File file = new File("test.txt");
		try {
			file.createNewFile();
			file.mkdir();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
