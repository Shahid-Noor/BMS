/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.ex;

/**
 *
 * @author shahid
 */
public class NoAccountsFoundException extends Exception {
    
    public NoAccountsFoundException(String message) {
        super(message);
    }
    
    public NoAccountsFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
