
public class Alcohol extends Beverage{
	private boolean servedOnWeekends;
	private static final double weekendFee = 0.6;
	
	public Alcohol(String name, SIZE s, boolean servedOnWeekends) {
		super(name, TYPE.ALCOHOL, s);
		this.setServedOnWeekends(servedOnWeekends);
	}
	
	public double calcPrice() {
		double price = 0;
		// no idea how I figure out if it's the weekend
		price += (servedOnWeekends) ? weekendFee : 0;
		price +=  this.getBasePrice() + ((SIZE.SMALL == this.getSize()) ? 0 : (SIZE.MEDIUM == this.getSize()) ? this.getSizeprice() : this.getSizeprice()*2); 
		
		return price;
	}
	
	public boolean equals(Alcohol a) {
		return (this.getSize() == a.getSize()) && (this.getBevName() == a.getBevName()) && (this.getBevType() == a.getBevType()) && (this.isServedOnWeekends() == a.isServedOnWeekends());
	}
	
	public String toString() {
		String outStr = "Alchohol Name: " + this.getBevName() + "\n";
		outStr += "Size: " + this.getSize() + "\n";
		outStr += "Served On Weekends: " + ((servedOnWeekends) ? "Yes\n": "No\n");
		outStr += "Price: " + this.calcPrice() + "\n";
		return outStr;
	}
	
	public boolean isServedOnWeekends() {
		return servedOnWeekends;
	}

	public void setServedOnWeekends(boolean servedOnWeekends) {
		this.servedOnWeekends = servedOnWeekends;
	}
}
