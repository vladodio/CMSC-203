
public abstract class Beverage {
	private String bevName;
	private TYPE bevType;
	private SIZE Size;
	private final double basePrice = 2.0;
	private final double sizePrice = 1.0;
	
	public Beverage(String name, TYPE t, SIZE s) {
		setBevName(name);
		setBevType(t);
		setSize(s);
	}
 
	public abstract double calcPrice();
	
	public String toString() {
		String outstr = "Name: " + this.getBevName() + " Type: " + this.getBevType().name() + " Size: "+ this.getSize().name();
		return outstr;
	}
	
	public boolean equals(Beverage b) {
		return (this.getSize() == b.getSize()) && (this.getBevName() == b.getBevName()) && (this.getBevType() == b.getBevType());
	}

// getters and setters
	public SIZE getSize() {
		return Size;
	}

	public void setSize(SIZE beverageSize) {
		this.Size = beverageSize;
	}

	public TYPE getBevType() {
		return bevType;
	}
	
	// tester used different getter name
	public TYPE getType() {
		return bevType;
	}

	public void setBevType(TYPE beverageType) {
		this.bevType = beverageType;
	}

	public String getBevName() {
		return bevName;
	}

	public void setBevName(String beverageName) {
		this.bevName = beverageName;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public double getSizeprice() {
		return sizePrice;
	}

	
}
