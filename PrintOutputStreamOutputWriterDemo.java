package Day_6;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 打印流
 * @author xie19
 *
 */
public class PrintOutputStreamOutputWriterDemo {
	public static void main(String[] args) throws Exception {
		//字节输出流打印流不受刷新的印象
//		PrintStream printStream = new PrintStream("E:/File测试/1.txt");
//		printStream.write("ABCDEFG".getBytes());
//		printStream.print(12);
//		printStream.println();
//		printStream.print(true);
//字符打印输出流
		PrintWriter printWriter = new PrintWriter("E:/File测试/2.txt");
		printWriter.write("ABCDEFG");
		printWriter.write(12312);
		printWriter.println();
		printWriter.print("ABCD");
		printWriter.close();
		//只会在调用的println，printf，或format方法来完成,或者使用关闭流的方式
	}
}
