package com.cg.pojo;

public class Books {
	private int bookID;
	/**
	 * @return the bookID
	 */
	public int getBookID() {
		return bookID;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}
	public Books(int bookID, String bookName, double price, String summary) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.price = price;
		this.summary = summary;
	}
	private String bookName;
	private double price;
	private String summary;


}
