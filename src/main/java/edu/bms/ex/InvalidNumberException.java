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
public class InvalidNumberException extends Exception {
    
    public InvalidNumberException(String message) {
        super(message);
    }
    
    public InvalidNumberException(String message, Throwable cause) {
        super(message, cause);
    }

}
