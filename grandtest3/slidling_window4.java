import java.util.*;
class slidling_window4{
    public static List<Integer> findanagram(String s,String p){
        List<Integer>result =new ArrayList<>();
        if(s.length()<p.length()) return result;
        int []pcount=new int[26];
        int[]scount=new int[26];
        for(int i=0;i<p.length();i++){
            pcount[p.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            scount[s.charAt(i)-'a']++;
        
            if(i>=p.length()){
                scount[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(pcount,scount)){
                result.add(i-p.length()+1);
            }
        }return result;
    }
    public static void main(String args[]){
        String s="cbaebacd";
        String p="abc";
        List<Integer> finalresult=findanagram(s,p);
        System.out.print(finalresult);

    }   
}