package threadTest;

public class Thread1 extends Thread{
	public String data;
	
	public Thread1() {;}
	public Thread1(String data) {
		super();
		this.data = data;
	}
	
//	run 
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(data);
//			try + catch: alt + shift
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
