package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 =new Point(3,5);
		Point p01 =new Point(3,5);
		Point p02 =new Point(13,15);
		Point p03 = p02; //new는 새 인스턴스를 생성하는거고 p03은 p02의 주소만 가져옴
		
		
		//equals() 재정의 후
		System.out.println(p00.equals(p01)); //논리비교
		System.out.println(p00==p01);//주소 비교
		System.out.println(p01.equals(p00)); //논리비교
		
		System.out.println(p02.equals(p03)); //논리비교
		
	
		
		
		
		
		
	}

}
