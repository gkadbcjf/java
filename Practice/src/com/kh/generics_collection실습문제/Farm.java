package com.kh.generics_collection실습문제;
//M(Model) : VO(value object) 데이터를 저장하는 객체
public class Farm {
	private String kind;

	public Farm(String kind) {
		super();
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Farm [kind=" + kind + "]";
	}

	@Override
	public int hashCode() {
		String str =this.kind;
		return str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Farm) {
			Farm other =(Farm)obj;
			if(this.getKind().equals(other.getKind()))
				return true;
			else
				return false;
		}
		else
			return false;
		
		
	}
	
	
	
}
