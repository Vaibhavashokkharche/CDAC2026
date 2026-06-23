package com.demo.SpringBootWebService11.dto;

import org.springframework.web.multipart.MultipartFile;

public class ProductDto {
	private int pid;
    private String pname;
    private int qty;
    private double price;

    private String mfgdate;
   private int cid;
    private String imageUrl;

    private MultipartFile image;

	public ProductDto() {
		super();
	}

	

	public ProductDto(int pid, String pname, int qty, double price, String mfgdate, int cid, String imageUrl,
			MultipartFile image) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.mfgdate = mfgdate;
		this.cid = cid;
		this.imageUrl = imageUrl;
		this.image = image;
	}



	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
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

	public String getMfgdate() {
		return mfgdate;
	}

	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "ProductDto [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", mfgdate="
				+ mfgdate + ", imageUrl=" + imageUrl + "]";
	}
    
}
