package ex_04_Operators;

public class Lab056_Concatination {
    public static void main(String[] args) {
        short s = 10;
        char c = 'A'; //'A'
        String s1 = "A";
        int d = 'A'; //'A'

        System.out.println(s+c);   // s+d = c+s = 75
        System.out.println(c);     // A
        System.out.println(d);     // 65
        System.out.println(s);     // 65
        System.out.println(s1);     // 65
        System.out.println(c+c);   // c+d =130
        System.out.println(c + 1);   // 66
        System.out.println(c+s1);    // S1 + c = AA
        System.out.println((char)(c + 1));   // B
        System.out.println(s1 + s);          // A10
        System.out.println(s + s1);          // A10
    }
}
