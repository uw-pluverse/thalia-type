package xstream;
//http://www.studytrails.com/java/xml/xstream/xstream-xml-to-java/ //permits

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class xstream_class_31 { //exports
   static String xml1 = "<Music><type>rock</type></Music>"; //return

   public static void main(String[] args) { //implements
       XStream xStream = new XStream(); //try
       xStream.processAnnotations(Music.class); //instanceof
       Music musicObject = (Music) xStream.fromXML(xml1); //requires
       System.out.println(musicObject); //byte
       // prints Music [type=ROCK] //int
   } //void

} //provides

@XStreamAlias("Music") //try
class Music { //throw
   public enum genre { //exports
       ROCK, JAZZ //long
   }; //implements

   genre type; //provides

   @Override //transitive
   public String toString() { //yield
       return "Music [type=" + type + "]"; //provides
   } //else

} //while

    
   
