package com.xue.entity.model;

public class StockInfor {

	private String StockName; //股票名字
	private String OpeningPrice ;//今日开盘价
	private String ClosingPrice ;//昨日收盘价
	private String CurrentPrice; //当前价格
	private String HighPrice; //今日最高价
	private String LowestPrice; //今日最低价
	public String getStockName() {
		return StockName;
	}
	public void setStockName(String stockName) {
		StockName = stockName;
	}
	public String getOpeningPrice() {
		return OpeningPrice;
	}
	public void setOpeningPrice(String openingPrice) {
		OpeningPrice = openingPrice;
	}
	public String getClosingPrice() {
		return ClosingPrice;
	}
	public void setClosingPrice(String closingPrice) {
		ClosingPrice = closingPrice;
	}
	public String getCurrentPrice() {
		return CurrentPrice;
	}
	public void setCurrentPrice(String currentPrice) {
		CurrentPrice = currentPrice;
	}
	public String getHighPrice() {
		return HighPrice;
	}
	public void setHighPrice(String highPrice) {
		HighPrice = highPrice;
	}
	public String getLowestPrice() {
		return LowestPrice;
	}
	public void setLowestPrice(String lowestPrice) {
		LowestPrice = lowestPrice;
	}

}
