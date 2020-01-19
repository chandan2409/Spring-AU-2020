package xmlprocessing;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;


public class Dom {
public static void main(String[] args)
{
	try {
		File course=new File("course.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(course);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("course");
        
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("Student roll no : " 
                  + eElement.getAttribute("reg_num"));
               System.out.println("Subject : " 
                  + eElement
                  .getElementsByTagName("subj")
                  .item(0)
                  .getTextContent());
               System.out.println("Course : " 
                  + eElement
                  .getElementsByTagName("crse")
                  .item(0)
                  .getTextContent());
               System.out.println("Section : " 
                  + eElement
                  .getElementsByTagName("sect")
                  .item(0)
                  .getTextContent());
               System.out.println("Title : " 
                  + eElement
                  .getElementsByTagName("title")
                  .item(0)
                  .getTextContent());
               System.out.println("Units : " 
                       + eElement
                       .getElementsByTagName("units")
                       .item(0)
                       .getTextContent());
               System.out.println("Instructor : " 
                       + eElement
                       .getElementsByTagName("instructor")
                       .item(0)
                       .getTextContent());
               System.out.println("Days : " 
                       + eElement
                       .getElementsByTagName("days")
                       .item(0)
                       .getTextContent());
               System.out.println("Start Time " 
                       + eElement
                       .getElementsByTagName("start_time")
                       .item(0)
                       .getTextContent());
               System.out.println("End Time " 
                       + eElement
                       .getElementsByTagName("end_time")
                       .item(0)
                       .getTextContent());
               System.out.println("Building " 
                       + eElement
                       .getElementsByTagName("building")
                       .item(0)
                       .getTextContent());
               System.out.println("Room " 
                       + eElement
                       .getElementsByTagName("room")
                       .item(0)
                       .getTextContent());
               
            }
         }

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
