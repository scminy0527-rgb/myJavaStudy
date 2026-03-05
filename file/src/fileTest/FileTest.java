package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
//		new FileWriter(경로(+파일), 이어쓰기 여부)
//		BufferedWriter bufferedWriter = null;
//		try {
////			false 로 하면 큰일남
//			bufferedWriter = new BufferedWriter(new FileWriter("./test.txt", true));
//			bufferedWriter.write("오늘 점심 메뉴 테스트\n");
//			bufferedWriter.write("김치찌개\n");
//			bufferedWriter.write("양념치킨\n");
//			bufferedWriter.write("치킨공식\n");
//			bufferedWriter.flush();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				bufferedWriter.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("./test.txt"));
			
			String line = null;
	//		line = bufferedReader.readLine();
				
	//		while((line = bufferedReader.readLine()) != null) {
	//			System.out.println(line);
	//		}
			bufferedReader.lines().forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bufferedReader != null) {
				bufferedReader.close();
			}
		}
		
		
		
		
	}
}
