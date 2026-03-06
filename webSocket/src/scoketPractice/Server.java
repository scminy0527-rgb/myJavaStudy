package scoketPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		String clientMsg = null, serverMsg = null;
		System.out.println("클라이언트로 부터 받을 준비");
		try(
				ServerSocket serverSocket = new ServerSocket(1100);
				Socket socket = serverSocket.accept();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				Scanner sc = new Scanner(System.in);
				){
			System.out.println("클라이언트가 연결 되었습니다.");
			while(true) {
				clientMsg = bufferedReader.readLine();
				System.out.println("[클라이언트]: " + clientMsg);
				System.out.println("클라이언트로 보낼 답변을 입력하시오...");
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
