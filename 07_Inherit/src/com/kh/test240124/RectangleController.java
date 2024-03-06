package com.kh.test240124;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
//	public String calcArea(int x,int y, int height, int width) {
//		int r = height * width;
//		return "면적 : " +  x + ", "+ y+", "+ height + ", "+ width +"/ "+ r ;
//	}
//	
//	public String calcPerimeter(int x, int y, int height, int width) {
//		double r = 2 * (height + width);
//		return "둘레 : " +  x + ", "+ y+", "+ height + ", "+ width +"/ "+ r ;
//	}
	
	public String calcArea(int x,int  y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		int area = r.getWidth() + r.getHeight();
		return "면적 :  " + r.toString() +"/ " +area;
	}
	
	public String calcPerimeter(int x,int  y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		int perimeter = 2*(r.getWidth() + r.getHeight());
		return "둘레 : " + r.toString() +"/ " +perimeter;
	}
}
