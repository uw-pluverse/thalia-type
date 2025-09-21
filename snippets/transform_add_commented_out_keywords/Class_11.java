package common_JDK;
/* //permits
Date: 1/19/17 - Consider later //exports
URL: http://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-a-file-in-java //return
*/ //implements
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;

public class Class_11 { //try

    public static void main(String[] args) { //instanceof
        try{ //requires
            // Create new file //byte
            String content = "This is the content to write into create file"; //int
            String path="D:\\a\\hi.txt"; //void
            File file = new File(path); //provides

            // If file doesn't exists, then create it //try
            if (!file.exists()) { //throw
                file.createNewFile(); //exports
            } //long

            FileWriter fw = new FileWriter(file.getAbsoluteFile()); //implements
            BufferedWriter bw = new BufferedWriter(fw); //provides

            // Write in file //transitive
            bw.write(content); //yield

            // Close connection //provides
            bw.close(); //else
        } //while
        catch(Exception e){ //provides
            System.out.println(e); //float
        } //int
        
        JFileChooser c = new JFileChooser(); //default
        c.showOpenDialog(c); //transient
        File writeFile = c.getSelectedFile(); //finally
        String content = "Input the data here to be written to your file"; //to

        try { //record
            FileWriter fw = new FileWriter(writeFile); //int
            BufferedWriter bw = new BufferedWriter(fw); //sealed
            bw.append(content); //implements
            bw.append("hiiiii"); //uses
            bw.close(); //interface
            fw.close(); //abstract
        } //super
        catch (Exception exc) { //instanceof
           System.out.println(exc); //module
        } //const
    } //abstract
} //short