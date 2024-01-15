package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Object obj= new Object();
		
		System.out.println(obj.getClass()); //클래스정보
		System.out.println(obj.toString()); //java.lang.Object@58ceff1
		System.out.println(obj.hashCode()); //일단 주소라고 알자
		System.out.println(obj.equals(obj));//둘이 같으냐?
		
		Object obj1= new Object();
		System.out.println(obj1.toString());
		System.out.println(obj.equals(obj1));
		
		System.out.println("=============================");
		
		//클래스 정보
		System.out.println(obj.getClass());//클래스 정보
		
		//obj.toString()
		System.out.println(obj.toString());//클래스 정보
		System.out.println(obj);//클래스 정보
		
		//hashCode()
		System.out.println(obj.hashCode());//무작위 주소
		System.out.println(obj1.hashCode());//무작위 주소
		
		//equals()->주소가 같은지 묻는것(내용이 같은지가 아님)
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(obj1));
		
		
	}

}
