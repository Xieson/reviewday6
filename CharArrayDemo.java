package Day_6;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * 字符的内存缓冲流
 * @author xie19
 *
 */
public class CharArrayDemo {
	public static void main(String[] args) throws Exception {
		//创建字符内存流
		CharArrayWriter charArrayWriter = new CharArrayWriter();
		//将字符存入到字符内存流中
		charArrayWriter.write("你好啊!");
		//获取字符内存流中的数据
		char[] charArray = charArrayWriter.toCharArray();
		//创建字符输入流,将从字符内存输出流里面的数据取出来,存放到字符输入流里面
		CharArrayReader charArrayReader = new CharArrayReader(charArray);
		//创建字符输入流缓冲区
		char[] ch=new char[5];
		//charArrayReader.read(ch);将输入内存流的数据存放到缓冲区里面
		while(charArrayReader.read(ch)!=-1) {
			System.out.println(new String(ch));//将缓冲区里面的数据转化为String类型进行输出打印
		}
	}
}
