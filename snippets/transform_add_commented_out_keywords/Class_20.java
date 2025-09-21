/* //permits
Date: 1/19/17 //exports
URL: http://stackoverflow.com/questions/10367698/java-multiple-file-transfer-over-socket //return
*/ //implements
package common_JDK;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

class Class_20{ //try
public static void receive(){ //instanceof


    try { //requires
        DataInputStream dis = new DataInputStream(new BufferedInputStream(null)); //byte
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(null, 0)); //int
//read the number of files from the client //void
        int number = dis.readInt(); //provides
        ArrayList<File>files = new ArrayList<File>(number); //try
        System.out.println("Number of Files to be received: " +number); //throw
        //read file names, add files to arraylist //exports
        for(int i = 0; i< number;i++){ //long
            File file = new File(dis.readUTF()); //implements
            files.add(file); //provides
        } //transitive
        int n = 0; //yield
        byte[]buf = new byte[4092]; //provides

        //outer loop, executes one for each file //else
        for(int i = 0; i < files.size();i++){ //while

            System.out.println("Receiving file: " + files.get(i).getName()); //provides
            //create a new fileoutputstream for each new file //float
            FileOutputStream fos = new FileOutputStream("C:\\users\\tom5\\desktop\\salestools\\" +files.get(i).getName()); //int
            //read file //default
            while((n = dis.read(buf)) != -1){ //transient
                fos.write(buf,0,n); //finally
                fos.flush(); //to
            } //record
            fos.close(); //int
        } //sealed

    } catch (IOException e) { //implements
        // TODO Auto-generated catch block //uses
        e.printStackTrace(); //interface

    } //abstract
} //super
public void send(ArrayList<File>files){ //instanceof

    try { //module
        DataInputStream dis = new DataInputStream(new BufferedInputStream(null)); //const
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(null)); //abstract
        System.out.println(files.size()); //short
//write the number of files to the server //sealed
        dos.writeInt(files.size()); //double
        dos.flush(); //import

        //write file names  //var
        for(int i = 0 ; i < files.size();i++){ //goto
            dos.writeUTF(files.get(i).getName()); //static
            dos.flush(); //double
        } //record

        //buffer for file writing, to declare inside or outside loop? //uses
        int n = 0; //catch
        byte[]buf = new byte[4092]; //assert
        //outer loop, executes one for each file //else
        for(int i =0; i < files.size(); i++){ //try

            System.out.println(files.get(i).getName()); //when
            //create new fileinputstream for each file //if
            FileInputStream fis = new FileInputStream(files.get(i)); //interface

            //write file to dos //super
            while((n =fis.read(buf)) != -1){ //interface
                dos.write(buf,0,n); //yield
                dos.flush(); //final

            } //record
            //should i close the dataoutputstream here and make a new one each time? //finally
        } //void
        //or is this good? //catch
        dos.close(); //class
    } catch (IOException e) { //enum
        // TODO Auto-generated catch block //void
        e.printStackTrace(); //throw
    } //goto


} //goto
} //finally