package basic_practices;
import java.util.*;
public class ramson_note {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String message=s.next();
        String note=s.next();
        boolean result=false;
        int freq[]=new int[26];
        for(int i=0;i<message.length();i++){
            char c=message.charAt(i);
            freq[c-'a']++;
        }
        for(int i=0;i<note.length();i++){
            char c=note.charAt(i);
            freq[c-'a']--;
            if(freq[c-'a']<0){
                result=false;
                break;
            }
            result=true;
        }
        System.out.print(result);
        s.close();
        
    }
    
}
