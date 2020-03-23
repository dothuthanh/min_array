import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        System.out.println("The smallest element in the array is : ");
        int []arr = {4,12,7,8,1,6,9};
        int min = arr[0];
        int index =1;
        for (int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i + 1;
            }
        }
        System.out.println("gia tri nho nhat la: " + min + "at postion :" + index);
    }
}
