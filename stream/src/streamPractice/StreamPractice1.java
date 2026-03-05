package streamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import streamTask.Member;

public class StreamPractice1 {
	public static void main(String[] args) {
//		1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		Integer[] nums = new Integer[] {10, 20, 30, 40, 50, 60};
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));
		System.out.println(numList);
		int total = numList.stream()
				.mapToInt(n -> n)
				.sum();
		System.out.println(total);
		
		Member member1 = new Member("id001", "홍길동", "축구_야구_농구", "나는 축구왕!");
		Member member2 = new Member("id002", "이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("id003", "장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("id004", "김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("id005", "김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("id006", "흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		
		
//      2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//      모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 이름과 취미를
//      아래와 같이 출력한다
//      이름: 홍길동
//      취미: 스포츠댄스, 개발
		Member[] members = new Member[] {member1, member2, member3, member4, member5, member6};
		ArrayList<Member> memberList = new ArrayList<Member>(Arrays.asList(members));
//		System.out.println(memberList);
		memberList.stream()
		.filter(mem -> mem.getHobby().contains("개발"))
		.map(mem -> "이름: " + mem.getName() + "\n취미 :" + mem.getHobby().replaceAll("_", ", "))
		.forEach(System.out::println);
		
//		3) 취미를 3개 이상 가진 사람의 id를 출력
		memberList.stream()
		.filter(mem -> mem.getHobby().split("_").length >= 3)
		.map(Member::getId)
		.forEach(System.out::println);
		
//		4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds에 담기
		List<String> hobbyIds = memberList.stream()
				.filter(mem -> mem.getHobby().split("_").length >= 3)
				.map(Member::getId)
				.collect(Collectors.toList());
		
//		System.out.println(hobbyIds);
		
//		5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개 출력하기
		memberList.stream()
		.filter(mem -> hobbyIds.contains(mem.getId()))
		.map(mem -> "이름: " + mem.getName() + "\n취미 :" + mem.getHobby().replaceAll("_", ", ") + "\n소개: " + mem.getIntro())
		.forEach(System.out::println);
		
		
//      6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
//      출력 예시)
//         이름: 흰둥이
//         취미: 개발_축구_농구
//         소개: 개발도 운동도 다 잘해요!
		memberList.stream()
		.max(Comparator.comparingInt(mem -> mem.getIntro().length()))
		.ifPresent(mem -> {
			System.out.println("이름: " + mem.getName());
			System.out.println("취미: " + mem.getHobby());
			System.out.println("소개: " + mem.getIntro());
		});
		
	}
}
