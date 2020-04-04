package Day_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据流
 * @author xie19
 *
 */
public class DateOutputWriterDataInputSream {
	public static void main(String[] args) throws Exception {
		File file=new File("E:/File测试/inout.txt");
//		writer1(file);
		reader1(file);
	}

	private static void writer1(File file) throws IOException {
		// TODO Auto-generated method stub		
		DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
//		dataOutputStream.write("abc".getBytes());
		dataOutputStream.writeUTF("你好帅");
		dataOutputStream.close();
	}
	private static void reader1(File file)throws Exception {
	DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
//	System.out.println(dataInputStream.readByte());
	System.out.println(dataInputStream.readUTF());
	dataInputStream.close();
	}
}
