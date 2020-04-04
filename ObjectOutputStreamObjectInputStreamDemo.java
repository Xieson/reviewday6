package Day_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���л��ͷ����л�
 * ���л�:ObjectOutputStream
 * �����л�:ObjectInputStream
 * @author xie19
 *
 */
public class ObjectOutputStreamObjectInputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file=new File("E:/File����/object.txt");
//		ObjectOut(file);
		ObjectIn(file);
	}

	private static void ObjectOut(File file) throws IOException, IOException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
		objectOutputStream.writeObject(new User("����",12));
		objectOutputStream.close();
	}

	private static void ObjectIn(File file) throws IOException, IOException, ClassNotFoundException {
		ObjectInputStream ObjectInputStream=new ObjectInputStream(new FileInputStream(file));
		User user=(User)ObjectInputStream.readObject();
		System.out.println(user.name);
		ObjectInputStream.close();
	}
}

