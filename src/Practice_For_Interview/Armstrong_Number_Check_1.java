package Practice_For_Interview;

public class Armstrong_Number_Check_1 {
    public static void main(String[] args) {
        int num=153, sum=0, temp=num;
        while(temp!=0){
            int digit=temp % 10;
            sum+= Math.pow(digit,3);
            temp/= 10;
        }
        System.out.println(num==sum);
    }
}
