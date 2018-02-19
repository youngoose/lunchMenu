package com.javalec.lunchpay;

public class MainClass {

	public static void main(String[] args) {
		// Available to use the type of superclass so that's why we could instantiate Child1 object with the type "LunchMenu"
		LunchMenu child1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		LunchMenu child2 = new Child2(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);

		System.out.println("Total cost of Child1: " + child1.calculating());
		System.out.println("Total cost of Child2: " + child2.calculating());
	}
	
}
