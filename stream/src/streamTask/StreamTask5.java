package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import streamTask.Member;
import streamTest.User;

public class StreamTask5 {
	public static void main(String[] args) {
//      1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		Integer[] arr1 = {10, 20, 30, 40, 50, 60};
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(arr1));
		int totalSum = numList.stream().mapToInt(n -> n).sum();
		System.out.println(totalSum);
		
//      2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//      모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 이름과 취미를
//      아래와 같이 출력한다
//      이름: 홍길동
//      취미: 스포츠댄스, 개발
//
//      필드 : 이름, 취미, 소개
//      홍길동, 축구_농구_야구, 나는 축구왕!
//      이순신, 개발_당구_축구, 나는 개발자 좋아!
//      장보고, 피아노, 피아노만 한 우물!
//      김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//      김영희, 골프_야구, 운동 선수는 나의 꿈
//      흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
//
//


//      

		
		ArrayList<String> strList = new ArrayList<String>();
		
		Member member1 = new Member("id001", "홍길동", "축구_야구_농구", "나는 축구왕!");
		Member member2 = new Member("id002", "이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("id003", "장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("id004", "김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("id005", "김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("id006", "흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		
		Member[] memberArr = new Member[] {member1, member2, member3, member4, member5, member6};
		
		
		ArrayList<Member> memberList = new ArrayList<Member>();
		memberList.addAll(Arrays.asList(memberArr));
		
		memberList.stream().filter(member -> member.getHobby().contains("개발"))
		.map(member -> member.getName());
		
		memberList.stream()
	    .forEach(member -> {
	        System.out.println("이름: " + member.getName());
	        System.out.print("취미: ");
	        System.out.print(member.getHobby().replaceAll("_", ", "));
	    });
		
//      3) 취미를 3개 이상 가진 사람의 id를 출력
		memberList.stream()
		.filter(member -> member.getHobby().split("_").length >= 3)
		.forEach(member -> System.out.println(member.getId()));
		
//      4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds에 담기
				
		ArrayList<String> hobbyIds = new ArrayList<String> (memberList.stream()
				.filter(member -> member.getHobby().split("_").length >= 3)
				.map(Member::getId)
				.collect(Collectors.toList()));
		
		System.out.println(hobbyIds);
		System.out.println();
		
		
//		5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개 출력하기
		hobbyIds.stream()
		.forEach(id -> {
			System.out.println("id " + id + "의 맴버를 소개 합니다.");
			memberList.stream().forEach(member -> {
				if(member.getId().equals(id)) {
					System.out.println("이름 " + member.getName());
					System.out.println("취미: " + member.getHobby());
					System.out.println("소개: " + member.getIntro());
					System.out.println();
				}
			});
		});
//      6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
//      출력 예시)
//         이름: 흰둥이
//         취미: 개발_축구_농구
//         소개: 개발도 운동도 다 잘해요!
		memberList.stream()
	       .max(Comparator.comparingInt(member -> member.getIntro().length()))
	       .ifPresent(member -> {
	    	   System.out.println("이름: " + member.getName());
	    	   System.out.println("취미: " + member.getHobby());
	    	   System.out.println("소개: " + member.getIntro());
	       });
	}
}
