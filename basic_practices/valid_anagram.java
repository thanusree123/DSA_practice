package basic_practices;
import java.util.*;
public class valid_anagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    int freq[]=new int[26];
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        freq[c-'a']++;
    }
    for(int i=0;i<t.length();i++){
        char c=t.charAt(i);
        freq[c-'a']--;
    }
    boolean isAnagram = true;

    for (int i = 0; i < freq.length; i++) {
        if (freq[i] != 0) {
            isAnagram = false;
            break;
        }
    }
    
    if (isAnagram) {
        System.out.println("Anagram");
    } else {
        System.out.println("Not an Anagram");

    }
    sc.close();
    }
    
}
