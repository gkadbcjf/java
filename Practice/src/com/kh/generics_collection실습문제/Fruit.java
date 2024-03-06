package com.kh.generics_collection실습문제;

public class Fruit extends Farm{
	private String name;

	public Fruit(String kind,String name) {
		super(kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		String str =this.name+super.getKind();
		return str.hashCode();
		
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Fruit) {
			Fruit other =(Fruit)obj;
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
