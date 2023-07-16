public class InvertedNumber{
    public static void main(String[] args) {
        int n=4;
        for(int line=1;line<=n;line++){
            for(int number=4;number<=n-line+1;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}