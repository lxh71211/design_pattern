package xiaoxi;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 扩展FilterInputStream，这是所有InputStream的抽象装饰者
 * @author xiaoxi
 *
 */
public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c: Character.toLowerCase((char)c));
	}
	
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for(int i = offset; i < offset + result; i ++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}

}
