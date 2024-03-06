package Test;



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
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Fruit) {
			Fruit other =(Fruit)obj;
			if(this.getKind().equals(other.getKind())&&
					this.getKind().equals(other.getKind()))
				return true;
			else
				return false;
		}
		else
			return false;
	}
}
