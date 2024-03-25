package com.sathyajdbcProject;

public class ProductINFO {
int productId;
String ProductName;
double productPrice;
private ProductINFO(int productId, String productName, double productPrice) {
	super();
	this.productId = productId;
	ProductName = productName;
	this.productPrice = productPrice;
	
}
@Override
public String toString() {
	return "ProductINFO [productId=" + productId + ", ProductName=" + ProductName + ", productPrice=" + productPrice
			+ "]";
	
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
private ProductINFO() {
	super();
	// TODO Auto-generated constructor stub
}

}
