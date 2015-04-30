package com.levelup.model;

import java.io.Serializable;
import java.util.Date;

public class Tool implements Serializable {

    private Long id;
    private String name;
    private Date buyDate;
    private Date sellDate;
    private Double buyPrice;
    private Double sellPrice;

    public Tool() {
    }

    public Tool(Long id, String name, Date buyDate, Date sellDate, Double buyPrice, Double sellPrice) {
        this.id = id;
        this.name = name;
        this.buyDate = buyDate;
        this.sellDate = sellDate;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public Date getSellDate() {
        return sellDate;
    }

    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }
}