package com.example.SpringBootTesting.beans;



import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity
//@Table(name = "product")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class Product {

    private Integer pid;
    private String pname;
    private Integer qty;
    private Double price;
    private LocalDate mfgDate;

    public Product() {
    }

    public Product(Integer pid, String pname, Integer qty,
                   Double price, LocalDate mfgDate) {
        this.pid = pid;
        this.pname = pname;
        this.qty = qty;
        this.price = price;
        this.mfgDate = mfgDate;
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

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(LocalDate mfgDate) {
        this.mfgDate = mfgDate;
    }
}