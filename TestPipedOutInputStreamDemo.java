package Day_6;

import java.io.IOException;

/**
 * ���Թܵ����Ƿ���ʵ��ͨѶ
 * @author xie19
 *
 */
public class TestPipedOutInputStreamDemo {
	public static void main(String[] args) throws Exception {
		AThreadDemo aThreadDemo=new AThreadDemo();
		BThreadDemo bThreadDemo=new BThreadDemo(aThreadDemo);
		aThreadDemo.start();
		bThreadDemo.start();
	}
}
