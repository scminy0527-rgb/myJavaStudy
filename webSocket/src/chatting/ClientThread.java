package chatting;

import java.io.BufferedReader;

// 서버로 받은 매세지를 처리 (input Stream)
public class ClientThread implements Runnable {
	
	private BufferedReader input;
	
	public ClientThread() {;}
	public ClientThread(BufferedReader input) {
		this.input = input;
	}
	
	@Override
	public void run() {
		String line = null;
		
		try {
			while((line = input.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
