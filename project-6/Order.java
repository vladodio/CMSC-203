import java.util.ArrayList;

public class Order implements OrderInterface, Comparable<Order>{
	private int OrderNo;
	private double orderTime;
	private DAY orderDay;
	private Customer Customer;
	private ArrayList<Beverage> listOfBeverages;
	
	
	public Order(int num, DAY d, Customer c){
		this.setOrderNo(randomNum());
		this.setOrderDay(d);
		this.setOrderTime(num);
		this.Customer = new Customer(c);
		listOfBeverages = new ArrayList<Beverage>();
	}
	
	// seems like a valid implementation?
	public int randomNum() {
		return (int)(Math.random() * (90001 - 10000)) + 10000;
	}
	
	
	public int compareTo(Order a) {
		if(a.getOrderNo() == this.getOrderNo()) {
			return 0;
		}
		else if(a.getOrderNo() < this.getOrderNo()) {
			return 1;
		}
		else {
			return -1;
		}
	}

	
	public boolean isWeekend() {
		return((this.getOrderDay() == DAY.SATURDAY) || (this.getOrderDay() == DAY.SUNDAY));
	}

	public Beverage getBeverage(int itemNo) {
		return listOfBeverages.get(itemNo);
	}

	public void addNewBeverage(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		Coffee c = new Coffee(bevName, size, extraShot, extraSyrup);
		listOfBeverages.add(c);
	}

	public void addNewBeverage(String bevName, SIZE size) {
		Alcohol a = new Alcohol(bevName, size, this.isWeekend());
		listOfBeverages.add(a);
	}

	public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addPRotien) {
		Smoothie s = new Smoothie(bevName, size, numOfFruits, addPRotien);
		listOfBeverages.add(s);
	}


	public double calcOrderTotal() {
		double sum = 0;
		for(Beverage b : listOfBeverages) {
			sum += b.calcPrice(); 
		}
		return sum;
	}


	public int findNumOfBeveType(TYPE type) {
		int counter = 0;
		for(int i = 0; i < listOfBeverages.size(); i++) {
			if(listOfBeverages.get(i).getBevType() == type) {
				counter++;
			}
		}
		return counter;
	}
	
	public int getTotalItems() {
		return listOfBeverages.size();
	}
	
	public String toString() {
		String outstr = "ORDER NUMBER: " + this.getOrderNo() + "\nCUSTOMER NAME: " + this.getCustomer().getName() + "\n ORDER TOTAL:" + this.calcOrderTotal() + "\n";
		for(int i = 0; i < listOfBeverages.size(); i++) {
			outstr += "ITEM NUMBER " + i + "\n";
			outstr += this.getBeverage(i).toString() + "\n";
		}
		return outstr;
	}
	
	// getters and setters
	public int getOrderNo() {
		return OrderNo;
	}


	public void setOrderNo(int orderNumber) {
		this.OrderNo = orderNumber;
	}


	public DAY getOrderDay() {
		return orderDay;
	}


	public void setOrderDay(DAY orderDay) {
		this.orderDay = orderDay;
	}


	public double getOrderTime() {
		return orderTime;
	}


	public void setOrderTime(double orderTime) {
		this.orderTime = orderTime;
	}


	public ArrayList<Beverage> getListOfBeverages() {
		return listOfBeverages;
	}


	public void setListOfBeverages(ArrayList<Beverage> listOfBeverages) {
		this.listOfBeverages = listOfBeverages;
	}


	public Customer getCustomer() {
		return new Customer(Customer);
	}


	public void setAssociatedCustomer(Customer associatedCustomer) {
		this.Customer = new Customer(associatedCustomer);
	}




}
