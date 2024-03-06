package com.kh.test240124;

public class CircleController {
	private Circle c =new Circle();
//	public String calcArea(int x, int y,int radius) {
//		double r = Math.PI * (radius * radius);
//		return "면적 : " +  x + ", "+ y+", "+ radius + "/ "+ r ;
//	}
//	public String calcCircum(int x,int y,int radius) {
//		double r = Math.PI * (2 * radius);
//		return "둘레 : " +  x + ", "+ y+", "+ radius + "/ "+ r ;
//	}

	public String calcArea(int x,int y,int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double area =  Math.PI * (c.getRadius() * c.getRadius());
		return "면적 :  " +c.toString() +"/ "+area;
	}
	
	public String calcCircum(int x,int y,int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double area = Math.PI * (2 * c.getRadius());
		return "둘레 :  " +c.toString() +"/ "+area;
	}
}
