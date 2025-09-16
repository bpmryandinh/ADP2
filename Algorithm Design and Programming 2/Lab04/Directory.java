import java.io.File;

public class Directory {
    public static void main(String[] args) {
        File folder = new File("/Users/bryandinh/Downloads/");
        File [] files = folder.listFiles();

    
        for(int i = 0; i < files.length; i++){
            if (files[i].isDirectory()){
                System.out.println("Directory: " + files[i] + "\n");
            } else if (files[i].isFile()){
                System.out.println("File: " + files[i] + "\n");
            }
        }
    }
    
}
