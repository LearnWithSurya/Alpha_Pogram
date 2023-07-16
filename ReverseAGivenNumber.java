public class ReverseAGivenNumber{
    public static void main(String[] args) {
        int n=7281;
      int rev=0;
      while(n>0){
            int lastDigit=n%10;
                rev =(rev*10)+lastDigit;
                n/=10;
                 //System.out.print(rev);//output-double
      }
          System.out.print(rev);
    }
}