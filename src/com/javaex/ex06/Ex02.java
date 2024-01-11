package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");

		/*
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		System.out.println(a+b);
		*/
		
		a = a.concat(b); //문자열을 더해줌
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a); //공백을 잘라줌
		
		a = a.replace("ab", "12"); //앞-내가 바꾸려는 글자,뒤-바꾸어넣을 글자
		System.out.println(a);
		
		String[] aArray = a.split(",");//입력한 기호의 위치에서 잘라서 분배함->배열이고 몇갠지 모르니까..
			
			for(int i=0;i<aArray.length;i++) {
				System.out.println(aArray[i]);
			}
			System.out.println(a);
	
		String str = "Hello JAVA!";
		
		String result01 = str.substring(3);   // 배열이기 때문에..012...
		String result02 = str.substring(1,7); //1~7앞에!까지! 표시됨
		System.out.println( result01 );
		System.out.println( result02 );
		
		char result03 = str.charAt(8); //한글자만 출력
		System.out.println(result03);
		
		System.out.println(str.toString());
		
		System.out.println("------------------------");
		
		String s01 = new String("안녕");
		String s02 = new String("안녕");
		
		if(s01==s02) {
			System.out.println("주소 같음");
		}
		else {
			System.out.println("주소 다름");
		}
		
		if(s01.equals(s02)) {
			System.out.println("글자 같음");
		}
		else {
			System.out.println("글자 다름");
		}
		
		System.out.println("------------------------");
		
		/*
		String s03 = "안녕";
		
		if(s03.equals("안녕")){
		}
		*/
		
		String s03 = null;
		
		if("안녕".equals(s03)){
			System.out.println("출력");
		}
		
			
	}
}
