package com.hyc.study.day0126;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	public GalaxyNote9() {
		super.setMaker("삼성");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "고속충전, 고속 무선 충전\n";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "정전식, 와콤펜 지원\n";
	}

	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "번호를 누르고 통화버튼을 누름\n";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "수신 버튼을 누름\n";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1200만 듀얼 카메라\n";
	}

	@Override
	public boolean bluethoothPen() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String printInformation() {
		
		return "갤럭시 노트9은 "+ getMaker()+"에서 만들어졌고 제원은 다음과 같다.\n"+makeCall()+takeCall()
		+picture()+charge()+touch()+"블루투스 사용 여부 : "+ bluethoothPen()+"\n";
	}
	
	
	
}
