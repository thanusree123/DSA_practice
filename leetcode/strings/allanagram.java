// import java.util.*;
// class allanagram{
//     public static void main(String args[]){
//         String s="cbaebabacd";
//         String p="abc";
//         int scount[]=new int[26];
//         int pcount[]=new int[26];
//         List<Integer>result=new ArrayList<>();
//         for(char ch:p.toCharArray()){
//             pcount[ch-'a']++;
//         }
//         int size=p.length();
//         for(int i=0;i<s.length();i++){
//             scount[s.charAt(i)-'a']++;
        
//         if(i>=size){
//             scount[s.charAt(i-size)-'a']--;
//         }
//         if(Arrays.equals(pcount,scount)){
//             result.add(i-size+1);
//         }
//         }
//         System.out.print(result);
//     }
// }