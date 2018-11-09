package io.currencyapp.springboot.starter.messages;

public class Messages {

	private String userId;
	private String currencyFrom;
	private String currencyTo;
	private String amountSell;
	private String amountBuy;
	private String rate;
	private String originatingCountry;
	private String timePlaced;
	
	public String getTimePlaced() {
		return timePlaced;
	}

	public void setTimePlaced(String timePlaced) {
		this.timePlaced = timePlaced;
	}

	public Messages() {
		
	}
	
	public Messages(String userId, String currencyFrom, String currencyTo, String amountSell, String amountBuy,
			String rate, String originatingCountry, String timePlaced) {
		super();
		this.userId = userId;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.amountSell = amountSell;
		this.amountBuy = amountBuy;
		this.rate = rate;
		this.originatingCountry = originatingCountry;
		this.timePlaced = timePlaced;
		
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCurrencyFrom() {
		return currencyFrom;
	}
	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}
	public String getCurrencyTo() {
		return currencyTo;
	}
	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}
	public String getAmountSell() {
		return amountSell;
	}
	public void setAmountSell(String amountSell) {
		this.amountSell = amountSell;
	}
	public String getAmountBuy() {
		return amountBuy;
	}
	public void setAmountBuy(String amountBuy) {
		this.amountBuy = amountBuy;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getOriginatingCountry() {
		return originatingCountry;
	}
	public void setOriginatingCountry(String originatingCountry) {
		this.originatingCountry = originatingCountry;
	}
	
	
	
	
	
}
