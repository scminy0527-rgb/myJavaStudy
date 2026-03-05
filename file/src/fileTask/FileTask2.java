package fileTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileTask2 {
   public static void main(String[] args) throws IOException{
      
      String[] foods = {"잔치국수", "피자", "한우", "스테이크"};
      
//      사용하고 나면 리소스를 닫는 역할을 해줌
//      try catch 문 에서 리소스를 관리하는 방법
      
      try(
    		  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./food.txt"));
    		  ){
    	  for(String food : foods) {
    		  bufferedWriter.write(food + "\n");
    	  }
    	  
    	  bufferedWriter.flush();
      }
      
      
      String line = null, temp = "";
      try(
    		  BufferedReader bufferedReader = new BufferedReader(new FileReader("./food.txt"));
    		  ){
    	  
//    	  값을 수정
//    	  스테이크를 스파게티로 바꾸겠다.
    	  while((line = bufferedReader.readLine()) != null) {
    		  System.out.println(line);
    		  if(line.equals("스테이크")) {
    			  temp += "스파게티\n";
    			  continue;
    		  }
    		  temp += line + "\n";
    	  }
      }
      
//      여기서 작성
      try(
    		  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./food.txt"));
    		  ){
    	  bufferedWriter.write(temp);
      }
   }
}
