package ncsPr4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerPr4 {
	public static void main(String[] args) {
		int port = 1100;
		String clientMsg = null, serverMsg = null;
		System.out.println("클라이언트의 연결을 기다리는중...");
		try(
				ServerSocket serverSocket = new ServerSocket(port);
				Socket socket = serverSocket.accept();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				Scanner sc = new Scanner(System.in);
				){
			System.out.println("클라이언트 연결 완료");
			
			while(true) {
				clientMsg = bufferedReader.readLine();
				System.out.println("[클라이언트]: " + clientMsg);
				System.out.println("클라이언트에 보낼 메세지를 입력하시오");
				serverMsg = sc.nextLine();
				bufferedWriter.write(serverMsg + "\n");
				bufferedWriter.flush();
				System.out.println("[서버]: " + serverMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
