package Day_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * �������л�����
 * @author xie19
 *
 */
public class SeriallzableDamo {
	public static void main(String[] args) throws Exception {
		File file =new File("E:/File����/123.txt");
//		write1(file);
		Read1(file);
	}
//ʵ�����л�,�Ѷ��󴢴浽�ļ���ȥ
	private static void Read1(File file) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(in);
		User user= (User)objectInputStream.readObject();
		System.out.println(user.name+";"+user.age);
	}

	private static void write1(File file) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream out=new FileOutputStream(file);
		ObjectOutputStream object = new ObjectOutputStream(out);
		object.writeObject(new User("zhangsan",12));
		
	}
}
