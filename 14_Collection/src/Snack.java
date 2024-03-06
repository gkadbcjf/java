
public class Snack {
	private String flavor;
	private int caloy;
	
	public Snack() {
		super();
	}

	public Snack(String flavor, int caloy) {
		super();
		this.flavor = flavor;
		this.caloy = caloy;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCaloy() {
		return caloy;
	}

	public void setCaloy(int caloy) {
		this.caloy = caloy;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", caloy=" + caloy + "]";
	}
	
	
	
}
