/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XMLHandler {

    private static final String XML_PATH = "/H:/University Work/Java Work Space/Anas.xml";
    private static final String XML_OUT1 = "/H:/University Work/Java Work Space/Anas.xml";
    private static final String XML_OUT2 = "/H:/University Work/Java Work Space/Anas.xml";
    private static final String XML_OUT3 = "/H:/University Work/Java Work Space/Anas.xml";

    private static Logger log = LogManager.getLogger(XMLHandler.class);

    public XMLHandler() {

    }

    public void testReadOp() {
        try {
            InputStream streamToXml = new FileInputStream(XML_PATH);

            SAXReader reader = new SAXReader();
            Document document = reader.read(streamToXml);

            List<Node> nodes = document.selectNodes("/accounts");
            log.info("the total nodes are " + nodes.size());
            int count = 0;
            for (Node node : nodes) {
                Element element = (Element) node;

            }

            XMLWriter writer = new XMLWriter(new FileOutputStream(XML_OUT1)); 
            writer.write(document);
        } catch (DocumentException ex) {
            log.error("error while parsing xml", ex);
        } catch (FileNotFoundException fnfe) {
            log.error("file not found", fnfe);
        } catch (IOException ioe) {
            log.error("unable to read file", ioe);
        }
    }

    public void testWriteOp() {
        Document document = DocumentHelper.createDocument();
        Element root = document.addElement("university")
                .addAttribute("name", "Agriculture Unviersity");
        Element departments = root.addElement("departments");

        Element dept = departments.addElement("department");
        dept.addAttribute("code", "C0987");
        dept.addElement("name").setText("CS");
        dept.addElement("shehzadStudent").setText("Shahid Noor");

        dept = departments.addElement("department");
        dept.addAttribute("code", "C0123");
        dept.addElement("name").setText("IT");
        dept.addElement("shehzadaStudent").setText("Mansoor");

        Element offices = root.addElement("offices");
        offices.addElement("office1");
        offices.addElement("office2").addAttribute("attrib1", "chote")
                .addAttribute("attrib2", "officeboy").addAttribute("attrib3", "chaye wala");
        offices.addElement("office3");

        try {
            XMLWriter writer = new XMLWriter(new FileOutputStream(XML_OUT2),
                    OutputFormat.createPrettyPrint());
            writer.write(document);
        } catch (IOException ex) {
            log.error("error while writing xml", ex);
        }
    }

    public static void main(String[] args) {
        XMLHandler xml = new XMLHandler();
        xml.testReadOp();
        xml.testWriteOp();
    }
}
