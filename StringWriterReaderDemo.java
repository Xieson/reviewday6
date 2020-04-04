package Day_6;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * 字符串内存流
 * @author xie19
 *
 */
public class StringWriterReaderDemo {
	public static void main(String[] args) throws Exception {
		//创建字符串内存流
		StringWriter stringWriter = new StringWriter();
		//把数据存放到字符串内存流中
		stringWriter.write("你是猪吗");
		stringWriter.write("我不是");
		stringWriter.write("哦,我觉得你是");
		String string = stringWriter.toString();
	//创建字符串输入内存流
		StringReader s=new StringReader(string);
		char[] ch=new char[5];
		int len=1;
		while((len=s.read(ch))!=-1) {
			System.out.println(new String(ch,0,len));
		}
	}
}
