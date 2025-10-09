package Practice_For_Interview;

public class Reverse_Number {
    public static void main(String[] args) {
        int num=12345, Reversed=0;
        while(num!=0){
            Reversed = Reversed * 10 + num % 10;
            num/=10;
        }
        System.out.println(Reversed);
    }
}
