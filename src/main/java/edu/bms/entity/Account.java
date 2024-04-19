/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.entity;

import java.io.Serializable;

/**
 *
 * @author abbas
 */
public class Account implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private long number;
    private String title;
    private String type;
    private double initialDeposit;
    private String cnic;
    private String phoneNumber;
    private double balance;
    private String status;
    
    public Account() {
    }
    
    public Account(long number, String title) {
        this.number = number;
        this.title = title;
    }
    
    public Account(long number, String title, String type,double initialDeposit, 
            String cnic, String phoneNumber, double balance, String status) {
        this.number = number;
        this.title = title;
        this.type = type;
        this.initialDeposit = initialDeposit;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.status = status;
    }

    /**
     * @return the number
     */
    public long getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(long number) {
        this.number = number;
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the initialDeposit
     */
    public double getInitialDeposit() {
        return initialDeposit;
    }

    /**
     * @param initialDeposit the initialDeposit to set
     */
    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    /**
     * @return the cnic
     */
    public String getCnic() {
        return cnic;
    }

    /**
     * @param cnic the cnic to set
     */
    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "[title = " + this.title
                + ", type = " + this.type
                + "initialDeposit = " + this.initialDeposit
                + "cnic = " + this.cnic
                + "phoneNumber = " + this.phoneNumber
                + "balance = " + this.balance
                +"status = " + this.status + "]";
    }
    
}
