import java.util.Arrays;

public class ArrayLoop {
    public static void main(String[] args) {
        int [] list = { 23, 45, 32, 65, 22, 99, 1 };
       
        //max
        int max = 0;
        for (int i = 1; i < list.length; i++){
            if (list[i] > max){
                max = list[i];
            }
        }
        System.out.println("Maximum Value: " + max);

        //min
        int min = 0;
        for (int i = 1; i <list.length; i++){
            if (list[i] < 100){
                min = list[i];
            }
        }
        System.out.println("Minimum Value: " + min);

        //total
        int sum = 0;
        for (int i = 0; i < list.length; i++){
            sum += list[i];
        }
        System.out.println("Total (sum) of all the values: " + sum);

        //average
        int totalElements = list.length;
        int avg = sum/totalElements;

        System.out.println("Average: " + avg);
    }
}






