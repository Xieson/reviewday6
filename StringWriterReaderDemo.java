package Day_6;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * �ַ����ڴ���
 * @author xie19
 *
 */
public class StringWriterReaderDemo {
	public static void main(String[] args) throws Exception {
		//�����ַ����ڴ���
		StringWriter stringWriter = new StringWriter();
		//�����ݴ�ŵ��ַ����ڴ�����
		stringWriter.write("��������");
		stringWriter.write("�Ҳ���");
		stringWriter.write("Ŷ,�Ҿ�������");
		String string = stringWriter.toString();
	//�����ַ��������ڴ���
		StringReader s=new StringReader(string);
		char[] ch=new char[5];
		int len=1;
		while((len=s.read(ch))!=-1) {
			System.out.println(new String(ch,0,len));
		}
	}
}
