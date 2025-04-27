import java.util.*;
public class count_vowels_and_consonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("enter a string");
        s = sc.nextLine();
        int vowels = 0;
        int consonents = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                if(ch == 'a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
                vowels++;
                }
                else{
                    consonents++;
                }
            }
        }
        System.out.println("number of vowels-->  "  + vowels);
        System.out.println("number of consonents-->  "  + consonents);
    }
}
