package Day_6;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * �ַ����ڴ滺����
 * @author xie19
 *
 */
public class CharArrayDemo {
	public static void main(String[] args) throws Exception {
		//�����ַ��ڴ���
		CharArrayWriter charArrayWriter = new CharArrayWriter();
		//���ַ����뵽�ַ��ڴ�����
		charArrayWriter.write("��ð�!");
		//��ȡ�ַ��ڴ����е�����
		char[] charArray = charArrayWriter.toCharArray();
		//�����ַ�������,�����ַ��ڴ���������������ȡ����,��ŵ��ַ�����������
		CharArrayReader charArrayReader = new CharArrayReader(charArray);
		//�����ַ�������������
		char[] ch=new char[5];
		//charArrayReader.read(ch);�������ڴ��������ݴ�ŵ�����������
		while(charArrayReader.read(ch)!=-1) {
			System.out.println(new String(ch));//�����������������ת��ΪString���ͽ��������ӡ
		}
	}
}
