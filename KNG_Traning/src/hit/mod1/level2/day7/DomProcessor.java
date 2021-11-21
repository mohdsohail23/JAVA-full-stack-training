package hit.mod1.level2.day7;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
public class DomProcessor {
	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		dbf.setValidating(true);
		dbf.setIgnoringElementContentWhitespace(true);
		DocumentBuilder db=dbf.newDocumentBuilder();
				
		Document doc=db.parse("books.xml");
		Element rootElement=doc.getDocumentElement();
		System.out.println(rootElement.getChildNodes().getLength());
	}
}
