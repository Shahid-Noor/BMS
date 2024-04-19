/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.service.impl;

import edu.bms.ex.AccountNoNotFoundException;
import edu.bms.ex.DuplicateEntryException;
import edu.bms.ex.SystemNotAvailableException;
import edu.bms.service.IAccountService;
import static edu.bms.service.IAccountService.MSG_DUPLICATE_ACCOUNT;
import static edu.bms.service.IAccountService.MSG_SYS_DOWN;
import static edu.bms.service.IAccountService.MSG_XML_ERR;
import edu.bms.util.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 *
 * @author shahid
 */
public class XmlTest implements IAccountService {
    private static Logger log = LogManager.getLogger(AccountService.class);
    private static final String XML_PATH;

    static {
       
          XML_PATH = "/H:/University Work/Java Work Space/shan.xml";
    }
    @Override
    public void openAccount(long accountNumber, String accountHolderName,
            String cnic,String phoneNumber, 
            String accountType, double initialDeposit)
            throws SystemNotAvailableException, DuplicateEntryException{     
        try {
            this.createXMLIfNotExists();

            Document document = this.readXMLDocument();

            if (this.accountExists(document, accountNumber)) {
                throw new DuplicateEntryException(MSG_DUPLICATE_ACCOUNT);
            } else {
                List<Element> elements = document.selectNodes("/" + Constants.EL_ACCOUNTS);
                Element accounts = elements.get(0);
                Element account = accounts.addElement(Constants.EL_ACCOUNT);
                account.addAttribute(Constants.ATTRIB_NUMBER, "" + accountNumber);
                account.addElement(Constants.EL_ACCOUNT_HOLDER).setText(accountHolderName);
                account.addElement(Constants.EL_TYPE).setText(accountType);
                account.addElement(Constants.EL_INITIAL_DEPOSIT).setText("" + initialDeposit);
                account.addElement(Constants.EL_CNIC).setText(cnic);
                account.addElement(Constants.EL_PHONE_NUMBER).setText(phoneNumber);
                account.addElement(Constants.EL_BALANCE).setText("" + initialDeposit);
                account.addElement(Constants.EL_STATUS).setText(Constants.STATUS_OPENED);

                this.writeXMLDocument(document);

            }

        } catch (DocumentException | FileNotFoundException ex) {
            log.error("error occured", ex);
            throw new SystemNotAvailableException(MSG_XML_ERR);
        } catch (IOException ioe) {
            log.error("IO error: {}", ioe);
            throw new SystemNotAvailableException(MSG_SYS_DOWN);
        }
    }
    
    private void createXMLIfNotExists() throws IOException {

        File xml = new File(XML_PATH);
        if (!xml.exists()) {
            Document document = DocumentHelper.createDocument();
            document.addElement(Constants.EL_ACCOUNTS);

            OutputStream os = new FileOutputStream(xml);
            XMLWriter writer = new XMLWriter(os, OutputFormat.createPrettyPrint());
            writer.write(document);
            os.close();
        }
    }
    
    private boolean accountExists(Document document, long accountNumber) {
        String query = "listOfaccounts/account[@number=111]";
        query = "/" + Constants.EL_ACCOUNTS + "/" + Constants.EL_ACCOUNT
                + "[@" + Constants.ATTRIB_NUMBER + "=" + accountNumber + "]";

        return document.selectNodes(query).size() > 0;
    }
    
    private Document readXMLDocument() throws DocumentException {
        SAXReader reader = new SAXReader();
        return reader.read(XML_PATH);
    }
    
    private void writeXMLDocument(Document document) throws
            FileNotFoundException, IOException {

        OutputStream os = new FileOutputStream(XML_PATH);
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter writer = new XMLWriter(os, format);
        writer.write(document);
        os.close();

    }
    

    @Override
    public void updatePhoneNo(long accountNo, String newPhoneNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAddress(long accountNo, String newAddress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double withDraw(long accountNo, double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double deposit(long accountNo, double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double transfer(long accountNo, int accountNoTo, int accountNoFrom, double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close(long accountNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Element findAccountElement(long accountNumber) throws AccountNoNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
