/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.validators;

import edu.bms.ex.InsufficientBalanceException;

/**
 *
 * @author shahid
 */
public interface IValidator {

    public void validate(String... fields) throws InsufficientBalanceException;
    
}
