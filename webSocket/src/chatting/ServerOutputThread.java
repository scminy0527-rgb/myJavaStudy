package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;


// 서버에서 직접 메세지를 입력받아서 클라이언트에게 전송하는 쓰레드
public class ServerOutputThread implements Runnable{
   
   private final List<PrintWriter> outputList;

   public ServerOutputThread() {
      this.outputList = null;
   }
   
   public ServerOutputThread(List<PrintWriter> outputList) {
      this.outputList = outputList;
   }
   
   @Override
   public void run() {
      try(
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      ){
         String message = null;
         while((message = bufferedReader.readLine()) != null) {
            System.out.println("[서버]: " + message);
            synchronized(outputList) {
               for(PrintWriter out: outputList) {
                  out.println("[서버]: " + message);
               }
            }
         }
         
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
    	  
      }
      
   }
}


