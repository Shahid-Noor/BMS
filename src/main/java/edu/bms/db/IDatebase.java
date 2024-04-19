/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.db;

import edu.bms.entity.Account;

/**
 *
 * @author abbas
 */
public interface IDatebase {
    
    public void create(Account account) throws Exception;
    
}
