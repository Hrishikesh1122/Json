package com.hrishi.stocks;

public class HDFC {
	public int numOfShares;
    public int pricePerShare;
    public int TotalValue;
    
	
	@Override
	public String toString() {
		return "HDFC [numOfShares=" + numOfShares + ", pricePerShare=" + pricePerShare + ", TotalValue=" + TotalValue
				+ "]";
	}
	public int getTotalValue() {
		return TotalValue;
	}
	public void setTotalValue(int totalValue) {
		TotalValue = totalValue;
	}
	public int getNumOfShares() {
		return numOfShares;
	}
	public void setNumOfShares(int numOfShares) {
		this.numOfShares = numOfShares;
	}
	public int getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(int pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

}
