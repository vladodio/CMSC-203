
public class Smoothie extends Beverage{
	private int numOfFruits;
	private boolean proteinPowder;
	
	
	private static final double additionalFruitPrice = .5;
	private static final double proteinPowerPrice = 1.5;
	
	public Smoothie(String name, SIZE s, int numberOfFruits, boolean proteinPowder) {
		super(name, TYPE.SMOOTHIE, s);
		this.setNumOfFruits(numberOfFruits);
		this.setProteinPowder(proteinPowder);
	}

	public double calcPrice() {
		double price = 0;
		price += (this.isProteinPowder()) ? Smoothie.proteinPowerPrice : 0;
		price += this.getNumOfFruits() * Smoothie.additionalFruitPrice;
		price +=  this.getBasePrice() + ((SIZE.SMALL == this.getSize()) ? 0 : (SIZE.MEDIUM == this.getSize()) ? this.getSizeprice() : this.getSizeprice()*2); 
		
		return price;
	}
	
	public String toString() {
		String outStr = "Smoothie Name: " + this.getBevName() + "\n";
		outStr += "Size: " + this.getSize() + "\n";
		outStr += "Number of Fruit: " + (this.getNumOfFruits());
		outStr += "Protein Powder: " + ((this.isProteinPowder()) ? "Yes\n": "No\n");
		outStr += "Price: " + this.calcPrice() + "\n";
		return outStr;
	}
	
	public boolean equals(Smoothie s) {
		return (this.getSize() == s.getSize()) && (this.getBevName() == s.getBevName()) && (this.getBevType() == s.getBevType()) && (this.isProteinPowder() == s.isProteinPowder()) && (this.getNumOfFruits() == s.getNumOfFruits());
	}
	
	//getters and setters
	public int getNumOfFruits() {
		return numOfFruits;
	}

	public void setNumOfFruits(int numberOfFruits) {
		this.numOfFruits = numberOfFruits;
	}

	public boolean isProteinPowder() {
		return proteinPowder;
	}

	public void setProteinPowder(boolean proteinPowder) {
		this.proteinPowder = proteinPowder;
	}

	public double getAdditionalFruitPrice() {
		return additionalFruitPrice;
	}

	public double getProteinPowerPrice() {
		return proteinPowerPrice;
	}

	// extra getters to deal with discrepancies in tester
	public boolean getAddProtein() {
		return isProteinPowder();
	}
	
	public boolean getAddProtien() {
		return isProteinPowder();
	}



	
	
}
