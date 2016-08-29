package xiaoxi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) throws IOException {
		int c;
		try {
			//先用BufferedInputStream装饰，再用LowerCaseInputStream过滤
			InputStream in = new LowerCaseInputStream(new FileInputStream("test.txt"));
			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
