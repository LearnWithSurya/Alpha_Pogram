import java.util.*;

public class LargestArray {

    public static int isLargest(int number[]){
        int largest=Integer.MIN_VALUE;//-infinity
         for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
         }
         return largest;
    }
    public static int isSmallest(int number[]){
         int smallest=Integer.MAX_VALUE;//+infinity
         for(int i=0;i<number.length;i++){
            if(smallest>number[i]){
                smallest=number[i];
            }
         }
         return smallest;
     }
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int number[]={12,56,4,23,1};
          System.out.println(isLargest(number));
          System.out.println(isSmallest(number));
       }
}
