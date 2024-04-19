/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.service;

import edu.bms.ex.AccountNoNotFoundException;
import edu.bms.ex.DuplicateEntryException;
import edu.bms.ex.NoAccountsFoundException;
import edu.bms.ex.SystemNotAvailableException;
import java.util.List;
import org.dom4j.Element;

/**
 *
 * @author shahid
 */
public interface IAccountService {

    public static final String MSG_SYS_DOWN = "system is down please come again";
    public static final String MSG_XML_ERR = "Database appeared to be invalid ";
    public static final String MSG_DUPLICATE_ACCOUNT = "Account number is "
            + "already taken.Use another";

    public void openAccount(long accountNo, String accountHolderName, String cnic,
            String phoneNumber, String accountType, double initialDeposit)
            throws SystemNotAvailableException, DuplicateEntryException;

    public void updatePhoneNo(long accountNo, String newPhoneNo);

    public void updateAddress(long accountNo, String newAddress);

    public double withDraw(long accountNo, double amount);

    public double deposit(long accountNo, double amount);

    public double transfer(long accountNo, int accountNoTo, int accountNoFrom, double amount);

    public void close(long accountNo);

    public Element findAccountElement(long accountNumber)
            throws AccountNoNotFoundException;
    
    //public List<Long> listAccounts()
    //throws SystemNotAvailableException , NoAccountsFoundException;
}
