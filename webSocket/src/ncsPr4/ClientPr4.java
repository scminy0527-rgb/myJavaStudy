package ncsPr4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientPr4 {
	public static void main(String[] args) {
		int port = 1100;
		String ip = "192.168.161.230";
		String serverMsg = null, clientMsg = null;
		
		System.out.println("서버에 연결 시도...");
		try(
				Socket socket = new Socket(ip, port);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				Scanner sc = new Scanner(System.in);
				){
			System.out.println("서버 연결 성공!!");
			
			while(true) {
				System.out.println("서버에 보낼 메세지를 입력하시오");
				clientMsg = sc.nextLine();
				bufferedWriter.write(clientMsg + "\n");
				bufferedWriter.flush();
				System.out.println("[클라이언트]: " + clientMsg);
				serverMsg = bufferedReader.readLine();
				System.out.println("[서버]: " + serverMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
