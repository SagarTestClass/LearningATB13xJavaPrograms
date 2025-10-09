package Practice_For_Interview;
import java.util.HashSet;
public class Array_Duplicate_Remove {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 4, 5};
        HashSet<Integer> Set =new HashSet<>();
        for (int num:arr){
            Set.add(num);
            }
        System.out.println(Set);
    }
}