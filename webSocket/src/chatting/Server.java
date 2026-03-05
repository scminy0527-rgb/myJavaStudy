package chatting;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {
   public static void main(String[] args) {
      
      String clientMessage = null, serverMessage = null;
      ServerSocket serverSocket = null; 
      List<PrintWriter> outputList = Collections.synchronizedList(new ArrayList<>());
      
      try {
         serverSocket = new ServerSocket(7777);
         System.out.println("[서버 실행: 클라이언트 대기중...]");
         
         ServerOutputThread serverOutputThread = new ServerOutputThread(outputList);
         Thread thread1 = new Thread(serverOutputThread);
         thread1.start();
         
         while(true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("[접속 :" + clientSocket + "]");
            ServerThread serverThread = new ServerThread(clientSocket, outputList);
            Thread thread2 = new Thread(serverThread);
            thread2.start();
         }
         
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
			if(serverSocket != null) {
				 serverSocket.close();
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
      
      
   }
}










