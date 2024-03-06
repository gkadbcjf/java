package com.kh.EX02;
// 이름(name), 평균 합격컷(evgCut), 국어최저점수(koMin), 영어최저점수(enCut)
// 모든 데이터를 매개변수로받아 초기화하는 생성자 정의
public class University {
	private String name;
	private int evgCut;
	private int koMin;
	private int enCut;
	
	public University(String name, int evgCut, int koMin, int enCut) {
		this.name = name;
		this.evgCut = evgCut;
		this.koMin = koMin;
		this.enCut = enCut;
	}
	public String getName() {
		return this.name;
	}
	public int getEvgcut() {
		return this.evgCut;
	}
	public int getEnCut() {
		return this.enCut;
	}
	public int getKoCut() {
		return this.koMin;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	public void setEvgCut(int evgCut) {
		this.evgCut =evgCut;
	}
	public void setEnCut(int enCut) {
		this.enCut =enCut;
	}
	public void setKoCut(int koMin) {
		this.koMin =koMin;
	}
	
	//합격시 true /불합격시 false 리런
	public boolean isEvaluate(Student st) {
		if(st.getEvg()>=this.evgCut &&
				st.getEnScore() >=this.enCut &&
				st.getKoScore() >=this.koMin) {
			return true;
		}
		else
			return false;
	}

	
}
