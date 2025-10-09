package Practice_For_Interview;

public class Prime_Number_Between_Range {
    public static void main(String[]args){
        int start=10, end=50;
        for(int num=start; num<=end; num++){
            boolean isPrime=true;
            for (int i=2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime && num>1){
                System.out.print(num+" ");
            }
        }
    }
}
