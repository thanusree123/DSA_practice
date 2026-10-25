package basic_practices;
import java.util.*;
public class longest_prefix {
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        String s=n.next();
        HashSet<Character>set=new HashSet<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(right));
                left++;
            }
            set.add(s.charAt(right));
            int length=right-left+1;
            max=Math.max(length,max);
        }
        System.out.print(max);
        n.close();
    }
    
}
