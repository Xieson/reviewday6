package Day_6;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * ��ӡ��
 * @author xie19
 *
 */
public class PrintOutputStreamOutputWriterDemo {
	public static void main(String[] args) throws Exception {
		//�ֽ��������ӡ������ˢ�µ�ӡ��
//		PrintStream printStream = new PrintStream("E:/File����/1.txt");
//		printStream.write("ABCDEFG".getBytes());
//		printStream.print(12);
//		printStream.println();
//		printStream.print(true);
//�ַ���ӡ�����
		PrintWriter printWriter = new PrintWriter("E:/File����/2.txt");
		printWriter.write("ABCDEFG");
		printWriter.write(12312);
		printWriter.println();
		printWriter.print("ABCD");
		printWriter.close();
		//ֻ���ڵ��õ�println��printf����format���������,����ʹ�ùر����ķ�ʽ
	}
}
