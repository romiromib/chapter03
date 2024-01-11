package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 =new Point(3,5);
		Point p01 =new Point(3,5);
		Point p02 =new Point(13,15);
		Point p03 = p02; //new는 새 인스턴스를 생성하는거고 p03은 p02의 주소만 가져옴
		
		PointT pt00 = new PointT(3,5);//toString을 재정의한 class
		
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		
		System.out.println("-------------------------");
		
		//toString()
		System.out.println(p00);
		System.out.println(p00.toString());
		System.out.println(pt00.toString());
		
		System.out.println("-------------------------");
		
		//hashCode()
		System.out.println(p00.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		System.out.println("-------------------------");
		
		//equals()
		System.out.println(p00.equals(p01)); //p00 부모의 메소드 사용(로직은 같음)
		System.out.println(p01.equals(p00)); //p01 부모의 메소드 사용(로직은 같음)
		
		System.out.println(p02.equals(p03)); //p02의 주소만 가져온 p03이 같은지 확인
		
		
	}

}
