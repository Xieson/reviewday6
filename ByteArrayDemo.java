package Day_6;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 字节输入输出内存流
 * @author xie19
 *
 */
public class ByteArrayDemo {
	public static void main(String[] args) throws Exception {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byteArrayOutputStream.write("ABCGEFG".getBytes());
		System.out.println(byteArrayOutputStream);
		byte[] byteArray = byteArrayOutputStream.toByteArray();
//		for(byte by:byteArray) {
//			System.out.println(by);
//		}
		ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteArray);
		byte[] by=new byte[1024];
		while(byteArrayInputStream.read(by)!=-1) {
			System.out.println(new String(by));
		}
		
	}
}
