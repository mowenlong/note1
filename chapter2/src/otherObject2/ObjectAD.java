package otherObject2;

import java.util.concurrent.atomic.AtomicInteger;

//ԭ����
public class ObjectAD extends Thread {
	
	private AtomicInteger count = new AtomicInteger(0);
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 10000; i++) {
			System.out.println(count.incrementAndGet());
		}
	}

}
