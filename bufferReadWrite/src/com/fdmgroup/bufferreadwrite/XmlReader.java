package com.fdmgroup.bufferreadwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class XmlReader {
   public static void main(String[] args) {
      boolean bFirstName = false;
      boolean bLastName = false;
      boolean bNickName = false;
      boolean bMarks = false;
      
      try {
         XMLInputFactory factory = XMLInputFactory.newInstance();
         XMLEventReader fileIterate =
         factory.createXMLEventReader(new FileReader("input.txt"));

         while(fileIterate.hasNext()) {
            XMLEvent xmlEleme = fileIterate.nextEvent();
               
            switch(xmlEleme.getEventType()) {
               
               case XMLStreamConstants.START_ELEMENT:
                  StartElement startElement = xmlEleme.asStartElement();
                  String qName = startElement.getName().getLocalPart();

               if (qName.equalsIgnoreCase("student")) {
                  System.out.println("Start Element : student");
                  Iterator<Attribute> attributes = startElement.getAttributes();
                  String rollNo = attributes.next().getValue();
                  System.out.println("Roll No : " + rollNo);
               } else if (qName.equalsIgnoreCase("firstname")) {
                  bFirstName = true;
               } else if (qName.equalsIgnoreCase("lastname")) {
                  bLastName = true;
               } else if (qName.equalsIgnoreCase("nickname")) {
                  bNickName = true;
               }
               else if (qName.equalsIgnoreCase("marks")) {
                  bMarks = true;
               }
               break;

               case XMLStreamConstants.CHARACTERS:
                  Characters characters = xmlEleme.asCharacters();
               if(bFirstName) {
                  System.out.println("First Name: " + characters.getData());
                  bFirstName = false;
               }
               if(bLastName) {
                  System.out.println("Last Name: " + characters.getData());
                  bLastName = false;
               }
               if(bNickName) {
                  System.out.println("Nick Name: " + characters.getData());
                  bNickName = false;
               }
               if(bMarks) {
                  System.out.println("Marks: " + characters.getData());
                  bMarks = false;
               }
               break;

               case XMLStreamConstants.END_ELEMENT:
                  EndElement endElement = xmlEleme.asEndElement();
                  
               if(endElement.getName().getLocalPart().equalsIgnoreCase("student")) {
                  System.out.println("End Element : student");
                  System.out.println();
               }
               break;
            } 
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (XMLStreamException e) {
         e.printStackTrace();
      }
   }
}