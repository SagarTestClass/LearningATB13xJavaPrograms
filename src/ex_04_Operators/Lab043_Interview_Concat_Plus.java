package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String first_name = "Pramod";
        String last_name = "Dutta";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name);
        System.out.println(a + b);
        System.out.println(first_name + last_name + a + b);
        System.out.println(a + b + first_name + last_name);
        System.out.println(first_name + a);

        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub


    }
}
