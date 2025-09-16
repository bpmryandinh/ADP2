import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLoop {
    public static void main(String [] args) {
        ArrayList<Integer> list = 
        new ArrayList<Integer> (Arrays.asList(23, 45, 32, 65, 22, 99, 1));
    
    //max 
        int max = 0;
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println("Maximum Value: " + max);

    //min 
        int min = 0;
        for (int i = 1; i <list.size(); i++){
            if (list.get(i) < 100){
                min = list.get(i);
            }
        }
        System.out.println("Minimum Value: " + min);

    //Total of all of the values
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        
        System.out.println("Total (sum) of all the values: " + sum);
        
    //Average 
        double avg = sum/list.size();
    
        System.out.println("Average Value: " + avg);
    }
}

