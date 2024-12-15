import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import java.io.IOException;
import java.util.Scanner;

public class cwh_111_file {
    public static void main(String[] args) {
//         File myfile=new File("cwh111file.text");
//         try{
//         myfile.createNewFile();
//         } catch(IOException e){
//             System.out.println("unable to creat this file");
//             e.printStackTrace();
//         }
        // code write to file
      /*
        try{ FileWriter filterWriter=new FileWriter("cwh111file.text");
        filterWriter.write("this is our new file for java course/n okay no bye");
            filterWriter.close();
       }catch(IOException E) {
        E.printStackTrace();
       }
       
       //read a file
       File myFile=new File("cwh111file.text");
       try{
          Scanner sc=new Scanner(myFile);
          while(sc.hasNextLine()){
            String line= sc.nextLine();
            System.out.println(line);
            
          }
          sc.close();

       
    }catch(FileNotFoundException e){
        e.printStackTrace();
    }*/

    // Deleting a file
    File myFile=new File("cwh111file.text");
    if(myFile.delete()){
        System.out.println("I have deleted"+myFile.getName());
    }
    else{
        System.out.println("some problem occured while deleting a file");
    }
 }
    
}