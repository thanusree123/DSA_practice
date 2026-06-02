import java.util.*;
class slidling_window3{
    public static void main(String args[]){
        String str="abcabcbb";
        int maxlen=Integer.MIN_VALUE;
        HashSet<Character>set=new HashSet<>();
        int left=0;
        for(int right=0;right<str.length();right++){
            char ch=str.charAt(right);
            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            maxlen=Math.max(maxlen,right-left+1);
        }
            System.out.print(maxlen);
    }
}