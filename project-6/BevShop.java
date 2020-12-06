import java.util.ArrayList;
import java.util.Collections;

public class BevShop implements BevShopInterfce{
	private ArrayList<Order> orders; 
	private Order currentOrder;

	private final int maxAlcoholicDrinks = 3;
	
	public BevShop() {
		orders = new ArrayList<Order>();
	}
	
	public boolean validTime(int time) {
		return (MIN_TIME <= time) && (MAX_TIME >= time);
	}

	
	public boolean eligibleForMore() {
		return getNumOfAlcoholDrink() <= maxAlcoholicDrinks;
	}

	
	public boolean validAge(int age) {
		return age > MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
		currentOrder = new Order(time, day, new  Customer(customerName, customerAge));
		orders.add(currentOrder);
		
	}

	@Override
	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		this.currentOrder.addNewBeverage(bevName, size, extraShot, extraSyrup);
	}

	@Override
	public void processAlcoholOrder(String bevName, SIZE size) {
		this.currentOrder.addNewBeverage(bevName, size);		
	}

	@Override
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtien) {
		this.currentOrder.addNewBeverage(bevName, size, numOfFruits, addProtien);
	}

	@Override
	public int findOrder(int orderNo) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getOrderNo() == orderNo) {
				return i; 
			}
		}
		
		return -1;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		return orders.get(findOrder(orderNo)).calcOrderTotal();
	}

	@Override
	public double totalMonthlySale() {
		double sum = 0;
		for(int i = 0; i < orders.size(); i++) {
			sum+=orders.get(i).calcOrderTotal();
		}
		return sum;
	}

	public void sortOrders() {
		for(int i = 0; i < orders.size()-1; i++) {
			int indexOfSmallest = i;
			for(int j = i+1; j < orders.size(); j++) {
				if(orders.get(i).compareTo(orders.get(j)) < 0) {
					indexOfSmallest = j;
				}
				
				Collections.swap(orders, indexOfSmallest, j); 
			}
			
			
		}
	}
	
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
	}
	
	public String toString() {
		String str = "BEV SHOP\nMONTHLY SALES:" + totalMonthlySale()  +"\n\n";
		for(int i = 0; i < orders.size(); i++) {
			str += "Order " + i + "\n";
			str += orders.get(i).toString();
		}
		return str;
	}

	public Order getCurrentOrder() {
		return currentOrder;
	}


	public void setCurrentOrder(Order currentOrder) {
		this.currentOrder = currentOrder;
	}


	public int getNumOfAlcoholDrink() {
		return currentOrder.findNumOfBeveType(TYPE.ALCOHOL);
	}


	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}


	public boolean isMaxFruit(int i) {
		return i>MAX_FRUIT;
	}
	
	
}
