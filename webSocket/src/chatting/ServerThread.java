package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

// 서버에 클라이언트가 접속하면 소켓에 outputStream들만 모두 outputList에 추가
public class ServerThread implements Runnable{
   
   private final Socket socket;
   private final List<PrintWriter> outputList;
   private PrintWriter output;
   private BufferedReader input;
   
   public ServerThread() {
      this.socket = null;
      this.outputList = null;
   }
   
   public ServerThread(Socket socket, List<PrintWriter> outputList) {
      this.socket = socket;
      this.outputList = outputList;
      
      try {
         output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
         input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         
         synchronized (outputList) {
            outputList.add(output);
         }
         
         
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
   
   
//   클라이언트가 보낸 메세지들을 서버 콘솔로 무한 출력
   @Override
   public void run() {
      String line = null;
      
      try {
         while((line = input.readLine()) != null) {
            System.out.println(line);
            
            synchronized (outputList) {
               for(PrintWriter out : outputList) {
                  out.print(line);
               }
            }
         }
         
         
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
    	  try {
			if(socket != null) {
				  socket.close();
			  }
			  
			  if(input != null) {
				  input.close();
			  }
			  
			  if(output != null) {
				  output.close();
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
      }
      
   }
}










