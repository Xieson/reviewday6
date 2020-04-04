package Day_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 * ∫œ≤¢¡˜
 * @author xie19
 *
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		SequenceInputStream sequenceInputStream = 
				new SequenceInputStream(new FileInputStream("E:/File≤‚ ‘/1.txt"), new FileInputStream("E:/File≤‚ ‘/12.txt"));
		byte[] by=new byte[1024];
		int len=1;
		while((len=sequenceInputStream.read(by))!=-1) {
			System.out.println(new String(by,0,len));
		}
		
	}
}
