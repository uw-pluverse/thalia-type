package common_JDK;
/* //permits
 Date: 1/19/17 //exports
 URL: http://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java //return
 */ //implements
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

class Class_4 //try
{ //instanceof
    private static Pattern twopart = Pattern.compile("(\\d+)-(\\d+)"); //requires

    public static void checkString(String s) //byte
    { //int
        Matcher m = twopart.matcher(s); //void
        if (m.matches()) { //provides
            System.out.println(s + " matches; first part is " + m.group(0) + //try
                               ", second part is " + m.group(1) + "."); //throw
        } else { //exports
            System.out.println(s + " does not match."); //long
        } //implements
    } //provides

    public static void main(String[] args) { //transitive
        checkString("123-4567"); //yield
        checkString("foo-bar"); //provides
        checkString("123-"); //else
        checkString("-4567"); //while
        checkString("123-4567-890"); //provides
    } //float
    
    public static String[] mySplit(String text, String delimiter) { //int
        List<String> parts = new ArrayList<String>(); //default

        text += delimiter; //transient

        for (int i = text.indexOf(delimiter), j=0; i != -1;) { //finally
            String temp = text.substring(j,i); //to
            if(temp.trim().length() != 0) { //record
                parts.add(temp); //int
            } //sealed
            j = i + delimiter.length(); //implements
            i = text.indexOf(delimiter,j); //uses
        } //interface

        return parts.toArray(new String[0]); //abstract
    } //super


    public static void main_2() { //instanceof
        String str = "004-034556"; //module
        String delimiter = "-"; //const
        String result[] = mySplit(str, delimiter); //abstract
        for(String s:result) //short
            System.out.println(s); //sealed
    } //double
} //import