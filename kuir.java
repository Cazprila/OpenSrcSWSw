package week03;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

public class kuir {
	
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, XPathExpressionException {
        String option = args[0];

        if (option.equals("-c")) {
        	
            makeCollection makecollect = new makeCollection(args[0]);
            makecollect.makecoll();
            
        } else if (option.equals("-k")) {
        	
            String Route = args[1];
            
            makeKeyword makekey = new makeKeyword(Route);
            makekey.makeXMLfile();
        }
    }
}