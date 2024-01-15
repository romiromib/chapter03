package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {

		int a = 3; //문제없음
		
		Integer i = new Integer(3);
		System.out.println(i.toString());
		
		Integer sum = new Integer(3) + new Integer(3);
		System.out.println(sum.toString());
		
		Integer v01 = 3; //자동박싱-> new Integer (3)
		System.out.println(v01.toString());
		
		int v02 = i;
		System.out.println(v02); //자동언박싱
		
		
		//문자열-->정수
		/*
		Integer r01 = 100; //필요없는 내용을 굳이 아래문장을 위해서 쓰여졌으므로, parseInt를 static으로 해준다
		int result = r01.parseInt("1234567"); //문자열을 정수로 바꿈
		System.out.println(result +3);
		*/
		int result = Integer.parseInt("12345");
		System.out.println(result + 3);
		
		
		//정수-->문자열
		/*
		String str = "안녕하세요";
		String result02 = str.valueOf(555);
		System.out.println(result02 +2);
		*/
		String result02 = String.valueOf(999);
		System.out.println(result02 + 2);
		
		
		System.out.println(999+2);
		
	}

}
