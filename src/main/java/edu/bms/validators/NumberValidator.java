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
public class NumberValidator implements IValidator {
    
    private static final String ERR_MSG = "Input is not a valid decimal number.";

    @Override
    public void validate(String[] fields) throws InsufficientBalanceException {
        try {
            for (String field : fields) {
                Double.parseDouble(field);
            }
        } catch(NumberFormatException nfe) {
            throw new InsufficientBalanceException(ERR_MSG, nfe);
        }
    }
    
}
