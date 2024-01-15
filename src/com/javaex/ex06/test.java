package com.javaex.ex06;

public class test {

	public static void main(String[] args) {
		
		String s01 = "Hi";
		String s02 = "Hi";
		
		System.out.println(s01==s02);
		
		String s03 = "안녕";
		String s04 = "안녕";
		
		s03="하이";
		
		System.out.println(s04==s03);
		
		String s05 = "하이";
		
		System.out.println(s05==s03);
		
	}

}
