package hashMap.task;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class HashMapTask {
   public static void main(String[] args) {
      HashMap<String, String> userData = new HashMap<String, String>();
      
      userData.put("hobby1", "코딩");
      userData.put("hobby2", "잠자면서 코딩");
      userData.put("hobby3", "자기 전에 코딩");
      userData.put("hobby4", "밥먹으면서 코딩");
      userData.put("hobby5", "운동하면서 코딩");
      userData.put("hobby6", "하드 코딩");
      userData.put("hobby7", "바이브 코딩");
      userData.put("hobby8", "취중 코딩");
      userData.put("hobby9", "수면 코딩");
      userData.put("hobby10", "유중 코딩");
      
//      userData의 value 중 "운동" 또는 "수면" 또는 "유중"이 들어간 
//      key 이름을 모두 출력하시오 
      String[] standard = {"운동", "수면", "유중"};
      
//      System.out.println(userData);
      
      PrintMap pm = (data, findText) -> {
    	  
    	  Iterator<Entry<String, String>> iter = data.entrySet().iterator();
    	  while(iter.hasNext()) {
    		  Entry<String, String> entry = iter.next();
    		  String key = entry.getKey();
    		  String value = entry.getValue();
//    		  정규식 사용하면 편함
//    		  "찾을거1|찾을거2|찾을거3"
//    		  "찾을글자1|찾을글자2|찾을글자3"
              Pattern pattern = Pattern.compile(findText);
              if(pattern.matcher(value).find()) {
                  System.out.println(key);
              }
    	  }
      };
      
      pm.printMap(userData, "운동|수면|유중");
   }
}
