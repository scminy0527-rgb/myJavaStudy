package fileTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileTask {
	public static void main(String[] args) throws IOException {
		String[] foods = {"잔치국수", "피자", "한우", "스테이크"};
		ArrayList<String> foodList = new ArrayList<String>(Arrays.asList(foods));
//      음식 4가지를 메모장으로 만들고 콘솔에 출력
		
		BufferedWriter bufferedWriter = null;
		
		try {
			bufferedWriter = new BufferedWriter(new FileWriter("./food.txt", true));
			bufferedWriter.write("좋아하는 음식" + "\n");
//			foodList.stream().forEach(food -> {
//				try {
//					bufferedWriter.write(food + "\n");
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			});
			for(String food : foods) {
				bufferedWriter.write(food + "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("./food.txt"));
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
