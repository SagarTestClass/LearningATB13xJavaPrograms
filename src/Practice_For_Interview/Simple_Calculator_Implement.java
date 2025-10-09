package Practice_For_Interview;
import java.util.Scanner;

public class Simple_Calculator_Implement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");

        char operation = scanner.next().charAt(0);
        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                throw new RuntimeException("Invalid Operation");
        }
        System.out.println("Result:" + result);
    }
}

