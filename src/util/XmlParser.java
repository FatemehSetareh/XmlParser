package util;

import bean.OutLog;
import bean.Terminal;
import bean.Transaction;
import bean.Transactions;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

/**
 * Created by ${Dotin} on ${4/25/2015}.
 */
public class XmlParser extends DefaultHandler {
    private Terminal terminal;
    private ArrayList<Transaction> allSubTransaction;
    private Transactions transactions;
    private Transaction transaction;
    private OutLog outLog;

    public XmlParser() {
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if(qName.equals("terminal")){
            terminal = new Terminal();
            terminal.setId(attributes.getValue("id"));
            terminal.setType(attributes.getValue("type"));
        }
        else if(qName.equals("transactions")){
            transactions = new Transactions();
        }
        else if(qName.equals("transaction")){
            transaction = new Transaction();
            transaction.setId(Integer.parseInt(attributes.getValue("id")));
            transaction.setType(attributes.getValue("type"));
            transaction.setAmount(Integer.parseInt(attributes.getValue("amount")));
            transaction.setDeposit(attributes.getValue("deposit"));
        }else if (qName.equals("outLog")){
            outLog = new OutLog();
            outLog.setPath(attributes.getValue("path"));
        }
    }


 
}
