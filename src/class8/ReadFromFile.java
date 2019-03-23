package class8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		File f = new File("//Users/sdosapati/Downloads/Temp.txt");
		FileInputStream fis = new FileInputStream(f);
		// readFromFileOneByteAtATime(fis);
		readFromFileAllBytesInOneShot(fis);
		fis.close();
	}

	private static void readFromFileAllBytesInOneShot(FileInputStream fis) throws IOException {
		int x = fis.available();
		byte b[] = new byte[x];
		fis.read(b);
		String s = new String(b);
		System.out.println(s);
	}

	private static void readFromFileOneByteAtATime(FileInputStream fis) throws IOException {
		while (true) {
			int x = fis.read();
			if (x == -1)
				break;
			System.out.print((char) x);
		}
		return;
	}

}
