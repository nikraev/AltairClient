package ru.dtln.altair;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.*;


//класс формирования сообщения
public class Messages {
	
	Messages()
	{
		
	}
/*
	DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	Document doc = docBuilder.newDocument();
	
	
	//DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	//Document doc = docBuilder.newDocument();
	
	Element message = doc.createElement("message");
	doc.appendChild(message);
	
	Element authentication = doc.createElement("authentication");
	message.appendChild(authentication);
	
	Element login = doc.createElement("login");
	authentication.appendChild(login);
	
	Element password = doc.createElement("password");
	authentication.appendChild(password);
	
	login.setAttribute("example", "example1");
	password.setAttribute("exemple2", "exemple3");
	
	
	return doc;
*/
	
}
