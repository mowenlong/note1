package otherObject2;

//���̵߳���������,���ǲ�ͬ���̶߳��ڵȴ�һ�����������ܱ��ͷŵ���,�������̵߳�"����"����
public class ObjectQ implements Runnable {

	public String username;
	public Object lock1 = new Object();
	public Object lock2 = new Object();
	
	public void setFlag(String username){
		this.username = username;
	}
	
	//�����������л�����
	public void run() {
		if (username.equals("a")) {
			synchronized (lock1) {
				try {
					System.out.println("username=" + username);
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("��lock1-->lock2����˳��ִ����");
				}
			}
			
		}
		
		if(username.equals("b")){
			synchronized (lock2) {
				try {
					System.out.println("username=" + username);
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("��lock2-->lock1����˳��ִ����");
				}
			}
			
		}
	}
	
}