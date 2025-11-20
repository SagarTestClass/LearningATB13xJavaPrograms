package Practice_For_Interview;

import java.util.Scanner;

public class Implement_Simple_Login_System {
    public static void main(String[] args) {
        String username = "admin";
        String password = "password";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUserName = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (inputUserName.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials!");
        }
        scanner.close();
    }
}
