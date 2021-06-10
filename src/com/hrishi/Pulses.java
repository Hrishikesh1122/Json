package com.hrishi;

public class Pulses {
	public String name;
    public int weight;
    public int pricePerKg;
    public int totalPrice;
	
	@Override
	public String toString() {
		return "Pulses [name=" + name + ", weight=" + weight + ", pricePerKg=" + pricePerKg + ", totalPrice="
				+ totalPrice + "]";
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

    
}
