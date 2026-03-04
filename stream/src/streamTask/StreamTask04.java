package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask04 {
	public static void main(String[] args) {
		StreamTask04 ct = new StreamTask04();
		
//      모두 Stream 문법으로 활용
//      1. 1~10까지 ArrayList에 담고 총 합을 출력

//      1. 1~10까지 ArrayList에 담고 총 합을 출력
		ArrayList<Integer> numList = new ArrayList<Integer>();
		int totalSum = 0;
		
		IntStream.range(1, 11).forEach(numList::add);
		System.out.println(numList);
		
		totalSum = numList.stream()
				.mapToInt(n -> n)
				.sum();
		
		System.out.println("1부터 10 까지 총 합: " + totalSum);
		
//      2. ABCDEF를 각각 문자 별로 출력
		IntStream.range(0, 6).map(n -> n + (int)'A')
		.mapToObj(n -> (char)n)
		.forEach(System.out::println);
		
		
//      3. ABDEF를 문자열로 출력
		IntStream.range(0, 6).map(n -> n + (int)'A')
		.mapToObj(n -> "" + (char)n)
		.filter(s -> !s.equals("C"))
		.forEach(System.out::print);
		
		System.out.println();
		
//      4. 1~100까지 중 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> holsuList = new ArrayList<Integer>();
		
		IntStream.range(1, 101)
		.filter(n -> n % 2 == 1)
		.forEach(holsuList::add);
		
		System.out.println(holsuList);
		
//      5. 5개의 문자열 모두 소문자로 변경 후 a의 개수 출력
//      Black, WHITE, reD, yeLLow, PINk
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk", "apple"));
		ArrayList<String> somunja = new ArrayList<String>();
		int totalACount = 0;
//		System.out.println(wordList);
		wordList.stream()
		.map(String::toLowerCase)
		.forEach(somunja::add);
		
		System.out.println(somunja);
		
		totalACount = somunja.stream()
		.mapToInt(ct::countA)
		.sum();
		
		System.out.println(totalACount);
		
	
//		6. 첫 번째 문자가 대문자인 문자열만 출력
//      Apple, banana, Melon, tomato
		wordList = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "tomato"));
		wordList.stream()
		.filter(ct::isCapitalStart)
		.forEach(System.out::println);
		
		
//      7. 한글을 정수로 변경
//      "공일이삼" -> "0123"
		String standard = "공일이삼사오육칠팔구";
		
		String hangel = "공일이삼";
		String numStr = "";

		numStr = hangel.chars()
		.mapToObj(c -> "" + (char)c)
		.map(s -> "" + standard.indexOf(s))
		.collect(Collectors.joining());
		
		System.out.println(numStr);
		
//      8. 정수를 한글로 변경
//      "0123" -> "공일이삼" 
//		Scanner sc new Scanner(System.in);
		numStr = "0123";
		hangel = numStr.chars()
		.mapToObj(n -> "" + (char)n)
		.mapToInt(Integer::parseInt)
		.map(ct::findNumByHangel)
		.mapToObj(c -> "" + (char)c)
		.collect(Collectors.joining());
		
		System.out.println(hangel);
	}
	
	public int countA(String str) {
		int result = 0;
		for(String s : str.split("")) {
			if(s.equals("a")) {
				result++;
			}
		}
		return result;
	}
	
	public boolean isCapitalStart(String str) {
		boolean result = false;
		char c = str.charAt(0);
		if(c >= 'A' && c <= 'Z') {
			result = true;
		}
		return result;
	}
	
	public String findKorIdx(String s) {
		String kor = "공일이삼사오육칠팔구";
		int result = kor.indexOf(s);
		
		return  "" + result;
	}
	
	public char findNumByHangel(int num) {
		String kor = "공일이삼사오육칠팔구";
		return kor.charAt(num);
	}
	
}
