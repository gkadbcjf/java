package com.kh.generics_collection실습문제;

public class Vegetable extends Farm{
	String name;

	public Vegetable(String kind, String name) {
		super(kind);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vegetable [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		String str =this.name+super.getKind();
		return str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Vegetable) {
			Vegetable other =(Vegetable)obj;
			if(this.getKind().equals(other.getKind())&&
					this.getName().equals(other.getName()))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	
}
