import java.util.Scanner;
public class BinomialFactorial {
    public static int isFactorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
           f= f*i;
        }
        return f;
    }
    public static int isBinomialCoefficent(int n,int r){
            int fact_n=isFactorial(n);
             int fact_r=isFactorial(r);
             int fact_nmr=isFactorial(n-r);
             int bin_Coff=fact_n/(fact_r*fact_nmr);
             return bin_Coff;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(isFactorial(n));
        System.out.println(isBinomialCoefficent(n,r));
        
    }
}
