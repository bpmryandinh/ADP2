import java.util.Date;
import java.time.LocalTime;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Lab04{
    public static void main(String[] args) {

        //intializes date/time
        Date date = new Date(); 
        LocalTime currentTime = LocalTime.now();

        //try catch
        try{
            //create file
            File helloFile = new File("hello.txt");

            //write file
            FileWriter helloWriter = new FileWriter("hello.txt");

            //for loop to print "Hello World" and date/time 10x
            for (int i = 0; i < 10; i++){
                helloWriter.write("Hello World " + date + currentTime + "\n");
            }
            helloWriter.close();

            //scanner to read file
            Scanner scan = new Scanner(helloFile);

            while(scan.hasNextLine()){
                String word = scan.nextLine(); //scans/reads line
                System.out.println(word); // prints line
            }
            scan.close();
        } 
        catch (Exception e){
            System.err.println(e);
        }
    }
}