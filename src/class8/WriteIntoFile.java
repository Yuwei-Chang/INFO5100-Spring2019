package class8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoFile {

	public static void main(String[] args) throws IOException {
		File f = new File("//Users/sdosapati/Downloads/Temp.txt");
		FileOutputStream fos = new FileOutputStream(f, true);
		String s = " Kate ";
		byte b[] = s.getBytes();
		fos.write(b);
		fos.close();

	}

}
