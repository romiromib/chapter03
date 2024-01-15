package com.javaex.ex03;

public class Point {

	private int x;
	private int y;
	
	
	public Point() {
			
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	//equals를 재정의
	
	@Override
	public boolean equals(Object obj) {

		Point p = (Point)obj;
		boolean result;
		
		if(this.x == p.x && this.y==p.y) {
			result = true;
		}
		else { 
			result = false;
		}
		
		return result;
	}
	
	/*
	public boolean equals(Object o) {
	Point p = (Point)o ->이렇게 Object만 보이는걸 Point도 쓸수 있게 함(강제로 형변환)
	//o p01의 주소 0x888
	//본인의 x값과 o의 x값과 같은지? &&
	//본인의 y값과 o의 y값과 같은지? &&
	//this.x == o.x && this.y==o.y
	}
	 */
	
}
