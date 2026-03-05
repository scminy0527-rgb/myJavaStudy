package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		main thread 가 다 작업을 하기에 동기 작업 형태 (run)
//		start: 스레드끼리 알아서 작업을 하도록 시킴
//		Thread1 thread_1 = new Thread1("?");
//		Thread1 thread_2 = new Thread1("!");
		
//		thread_1.start();
//		Thread2.start();
		
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
		
		Thread thread1 = new Thread(target1, "⭐");
		Thread thread2 = new Thread(target2, "❤️");
		
		thread1.start();
		thread2.start();
		
//		멀티스레드의 우선 순위는 동일하다
//		thread1.setPriority(1);
//		thread2.setPriority(10);
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		main 이 위에 있는거 끝날때까지 기다리게 하는거
		System.out.println("메인스레드");
	}
}
