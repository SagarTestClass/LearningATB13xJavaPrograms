package Practice_For_Interview;

public class Vowels_Consonants_Counts {
    public static void main(String[]args){
        String Str = "Automation";
        int Vowels = 0, Consonants=0;
        for(char c : Str.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1) {
                Vowels++;
            } else if (Character.isLetter(c)){
                Consonants++;
            }
        }
        System.out.println("Vowels:" + Vowels+ ", Consonenats:" +Consonants);
    }
}
