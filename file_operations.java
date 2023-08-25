import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class file_operations {
     public static void main(String[] args)throws Exception {
        // ------->>>>> creating new file
        // File myfile=new File("omkar.txt");
        // myfile.createNewFile();
        
        
        //------->>>>> writing data in file 
        // FileWriter io=new FileWriter("omkar");
        // try{
        //     io.write("this is my first file");
        //     io.close();
        // }
        // catch(Exception e)
        // {
        //     System.out.println("unable to write in file ");
        // }
        
        //------->>>>> reading data in file 
        // File myfile =new File("om.txt");
        // try{
            //     Scanner sc=new Scanner(myfile);
            //     while(sc.hasNextLine())
            //     {
                //         String line =sc.nextLine();
                //         System.out.println(line); 
                //     }
                //     sc.close();
                // }
                // catch (Exception e)
                // {
                    //     System.out.println("file not found");
                    // e.printStackTrace();
                    // }
                    
                    //------->>>>> showing file if file is existed 
                    File myfile =new File("om.txt");
                    if(myfile.exists())
                    {
                        System.out.println("file detected "+myfile.getName());
         }
         else{
            System.out.println("file is not detected or not found");
         }
     }    
}
