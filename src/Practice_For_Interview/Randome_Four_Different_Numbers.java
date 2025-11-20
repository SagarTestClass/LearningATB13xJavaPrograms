package Practice_For_Interview;

import java.util.Random;

public class Randome_Four_Different_Numbers {
    public static void main(String[] args) {
     Random random = new Random();
     for (int i=0; i<5; i++){
         System.out.println(random.nextInt(100));
      }
    }
}