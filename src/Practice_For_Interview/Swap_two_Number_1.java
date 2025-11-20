package Practice_For_Interview;

public class Swap_two_Number_1 {
    public static void main(String[]args){

                int a=51, b=10;

                //1. Swapping using three variables
                int temp = a;
                a = b;
                b = temp;
                System.out.println("After Swapping, a = " + a + " and b = " + b);

                //2. Swapping using two variables
                a = a + b;
                b = a - b;
                a = a - b;
                System.out.println("After Swapping, a = " + a + " and b = " + b);

                //3. Swapping a and b using XOR
                a = a ^ b;
                b = a ^ b;
                a = a ^ b;
                System.out.println("After Swapping, a = " + a + " and b = " + b);
            }
        }

