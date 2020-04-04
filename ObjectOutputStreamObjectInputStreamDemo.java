package Day_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化和反序列化
 * 序列化:ObjectOutputStream
 * 反序列化:ObjectInputStream
 * @author xie19
 *
 */
public class ObjectOutputStreamObjectInputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file=new File("E:/File测试/object.txt");
//		ObjectOut(file);
		ObjectIn(file);
	}

	private static void ObjectOut(File file) throws IOException, IOException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
		objectOutputStream.writeObject(new User("张三",12));
		objectOutputStream.close();
	}

	private static void ObjectIn(File file) throws IOException, IOException, ClassNotFoundException {
		ObjectInputStream ObjectInputStream=new ObjectInputStream(new FileInputStream(file));
		User user=(User)ObjectInputStream.readObject();
		System.out.println(user.name);
		ObjectInputStream.close();
	}
}

