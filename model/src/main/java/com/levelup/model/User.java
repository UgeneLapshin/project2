package com.levelup.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private Long id;
    private String password;
    private String name;
    private String email;
    private Integer accountNumber;
    private Double amount;
    private List<Tool> toolList;

    public User() {
    }

    public User(Long id, String password, String name, String email, Integer accountNumber, Double amount) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<Tool> getToolList() {
        return toolList;
    }

    public void setToolList(List<Tool> toolList) {
        this.toolList = toolList;
    }
}
