package com.kh.Test240123;

public class Student {
	private String name;
	private int math_score;
	private int eng_score;
	private int go_score;
	double avg;
	
	public Student(String name, int math_score, int eng_score, int go_score) {
		
		this.name = name;
		this.math_score = math_score;
		this.eng_score = eng_score;
		this.go_score = go_score;
	}


	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMath_score() {
		return math_score;
	}



	public void setMath_score(int math_score) {
		this.math_score = math_score;
	}



	public int getEng_score() {
		return eng_score;
	}



	public void setEng_score(int eng_score) {
		this.eng_score = eng_score;
	}



	public int getGo_score() {
		return go_score;
	}



	public void setGo_score(int go_score) {
		this.go_score = go_score;
	}



	public double getAvg() {
		return avg;
	}



	public void setAvg(double avg) {
		this.avg = avg;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", math_score=" + math_score + ", eng_score=" + eng_score + ", go_score="
				+ go_score + "] + 평균 : "+this.get_avg();
	}



	public double get_avg() {
		avg = (math_score+eng_score+go_score)/3;
		return avg;
	}
	
	
}
