
public class Coffee extends Beverage {
	private boolean shotOfCoffee;
	private boolean shotOfSyrup;
	
	private static final double syrupFee = .5;
	private static final double coffeeShotFee = .5;

	
	public Coffee(String name, SIZE s, boolean shotOfCoffee, boolean shotOfSyrup) {
		super(name, TYPE.COFFEE, s);
		this.shotOfCoffee = shotOfCoffee;
		this.shotOfSyrup = shotOfSyrup;
	}
	
	public double calcPrice() { 
		double price = 0;
		price += (shotOfCoffee) ? coffeeShotFee : 0;
		price += (shotOfSyrup) ? syrupFee : 0;
		price +=  this.getBasePrice() + ((SIZE.SMALL == this.getSize()) ? 0 : (SIZE.MEDIUM == this.getSize()) ? this.getSizeprice() : this.getSizeprice()*2); 
		
		return price;
	}
	
	public boolean equals(Coffee c) {
		return (this.getSize() == c.getSize()) && (this.getBevName() == c.getBevName()) && (this.getBevType() == c.getBevType()) && (this.isShotOfSyrup() == c.isShotOfSyrup()) && (this.isShotOfCoffee() == c.isShotOfCoffee());
	}
	
	public String toString() {
		String outStr = "Coffee Name: " + this.getBevName() + "\n";
		outStr += "Size: " + this.getSize() + "\n";
		outStr += "Extra Shot of Coffee: " + ((this.isShotOfCoffee()) ? "Yes\n": "No\n");
		outStr += "Shot of Syrup: " + ((this.isShotOfSyrup()) ? "Yes\n": "No\n");
		outStr += "Price: " + this.calcPrice() + "\n";
		return outStr;
	}

	// getters and setters
	public boolean isShotOfCoffee() {
		return shotOfCoffee;
	}

	public void setShotOfCoffee(boolean shotOfCoffee) {
		this.shotOfCoffee = shotOfCoffee;
	}

	public boolean isShotOfSyrup() {
		return shotOfSyrup;
	}

	public void setShotOfSyrup(boolean shotOfSyrup) {
		this.shotOfSyrup = shotOfSyrup;
	}

	public boolean getExtraShot() {
		return isShotOfCoffee();
	}

	public boolean getExtraSyrup() {
		return isShotOfSyrup();
	}
	
}
