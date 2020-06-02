package com.Servelet.demo;

public class Product {
  String productName;
   String productPrice;
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductPrice() {
	return productPrice;
}
public void setProductPrice(String productPrice) {
	this.productPrice = productPrice;
}
public Product(String productName, String productPrice) {
	super();
	this.productName = productName;
	this.productPrice = productPrice;
}

   
   
   
	
	
}
