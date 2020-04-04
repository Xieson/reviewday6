package Day_6;

import java.io.IOException;
import java.io.PipedInputStream;
import java.util.Arrays;

/**
 * BThreadDemo���յ�AThreadDemo������
 * @author xie19
 *
 */
public class BThreadDemo extends Thread{
		PipedInputStream pis=null;
		public BThreadDemo(AThreadDemo aThreadDemo) throws IOException {
				pis=new PipedInputStream(aThreadDemo.goout());//��ȡAThreadDemo����Ĺܵ�ͨѶ������
	}
		@Override
		public void run() {
		try {
//			byte[] by=new byte[5];
//			pis.read();
			int len=1;
			while((len=pis.read())!=-1) {
				System.out.println((byte)len);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {if(pis!=null) {
				pis.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
}
