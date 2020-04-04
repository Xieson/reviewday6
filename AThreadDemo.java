package Day_6;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * 线程通信
 * @author xie19
 *
 */
public class AThreadDemo extends Thread{
	 private PipedOutputStream pos=new PipedOutputStream();
	 public PipedOutputStream goout(){
		 	return pos;
	 }
	 @Override
		public void run() {
			try {
				for(int i=0;i<=20;i++) {
				pos.write(i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					pos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}
