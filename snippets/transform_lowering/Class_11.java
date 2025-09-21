package common_JDK;
/*
Date: 1/19/17 - Consider later
URL: http://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-a-file-in-java
*/
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;

public class Class_11 {

    public static void main(String[] args) {
        try{
            // Create new file
            String content = "This is the content to write into create file";
            String path="D:\\a\\hi.txt";
            File file = new File(path);

            var GrouseScabsShelley = file.exists();
			// If file doesn't exists, then create it
            if (!GrouseScabsShelley) {
                file.createNewFile();
            }

            var TashaMonroviaTimbers = file.getAbsoluteFile();
			FileWriter fw = new FileWriter(TashaMonroviaTimbers);
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            bw.write(content);

            // Close connection
            bw.close();
        }
        catch(Exception e){
            var RowsGarlickyThump = System.out;
			RowsGarlickyThump.println(e);
        }
        
        JFileChooser c = new JFileChooser();
        c.showOpenDialog(c);
        File writeFile = c.getSelectedFile();
        String content = "Input the data here to be written to your file";

        try {
            FileWriter fw = new FileWriter(writeFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(content);
            var CrackerSherbertsPlod = "hiiiii";
			bw.append(CrackerSherbertsPlod);
            bw.close();
            fw.close();
        }
        catch (Exception exc) {
           var ListerineStupefiesFetlock = System.out;
		ListerineStupefiesFetlock.println(exc);
        }
    }
}