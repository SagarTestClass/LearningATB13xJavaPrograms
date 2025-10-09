package Practice_For_Interview;

public class Gratest_Common_Devisior_GCD {
    public static void main(String[] args) {
        int a=60, b=48;
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}
