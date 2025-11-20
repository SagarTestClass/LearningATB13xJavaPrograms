package Practice_For_Interview;

import java.util.Scanner;

public class Armstrong_Number_Check_User_Input {
    public static void main(String[] args) {
        // 153 = (1*1*1) + (5*5*5) + (3*3*3)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = scanner.nextInt();

       // int num=153;
        int sum = 0, res, temp;
        temp = num;

        while(num > 0){
            res = num % 10;
            num = num / 10;
            sum = sum + (res * res * res);
        }
        if (temp == sum)
            System.out.println(temp + " is Armstrong number");
        else
            System.out.println(temp + " is not Armstrong number");
    }
}
