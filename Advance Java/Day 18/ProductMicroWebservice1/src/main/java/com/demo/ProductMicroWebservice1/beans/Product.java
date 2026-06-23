package com.demo.ProductMicroWebservice1.beans;



public class Product {

    private Integer pid;
    private String pname;
    private Double price;
    private Integer cid;

    public Product() {
    }

    public Product(Integer pid, String pname, Double price, Integer cid) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.cid = cid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}
