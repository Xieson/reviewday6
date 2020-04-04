package Day_6;

import java.io.IOException;

/**
 * 测试管道流是否能实现通讯
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
