package com.demo.SpringBootWebService11.beans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Product {
  @Id	
  private int pid;
  
  @NotBlank(message="Product name required")
  private String pname;
  
  @Min(value=1,message="Qty must be greater than 0")
  //@Max(value=10,message="Qty must be less or equal to  than 10")
  private int qty;
  
  @DecimalMin(value="0.01",message="Price must be positive")
  private double price;
  
  @DateTimeFormat(pattern = "dd-MM-yyyy")
  private LocalDate mfgdate;
  
  private int cid;
  //step4 to add image add following field to store filename
  //add constructor and setter getter methods for this member
  //go to ProductController  /save url
  private String pimagefile;
  
  public Product() {
	super();
  }
  public Product(int pid, String pname, int qty, double price, LocalDate mfgdate, int cid) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.qty = qty;
	this.price = price;
	this.mfgdate = mfgdate;
	this.cid = cid;
  }
  
 
  public Product(int pid, @NotBlank(message = "Product name required") String pname,
		@Min(value = 1, message = "Qty must be greater than 0") int qty,
		@DecimalMin(value = "0.01", message = "Price must be positive") double price, LocalDate mfgdate, int cid,
		@NotBlank(message = "Image file required") String pimagefile) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.qty = qty;
	this.price = price;
	this.mfgdate = mfgdate;
	this.cid = cid;
	this.pimagefile = pimagefile;
}
  public String getPimagefile() {
		return pimagefile;
	}
	  public void setPimagefile(String pimagefile) {
		this.pimagefile = pimagefile;
	  }
  public int getPid() {
	return pid;
  }
  public void setPid(int pid) {
	this.pid = pid;
  }
  public String getPname() {
	return pname;
  }
  public void setPname(String pname) {
	this.pname = pname;
  }
  public int getQty() {
	return qty;
  }
  public void setQty(int qty) {
	this.qty = qty;
  }
  public double getPrice() {
	return price;
  }
  public void setPrice(double price) {
	this.price = price;
  }
  public LocalDate getMfgdate() {
	return mfgdate;
  }
  public void setMfgdate(LocalDate mfgdate) {
	this.mfgdate = mfgdate;
  }
  public int getCid() {
	return cid;
  }
  public void setCid(int cid) {
	this.cid = cid;
  }
  @Override
  public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", mfgdate=" + mfgdate
			+ ", cid=" + cid + "]";
  }
  
}
