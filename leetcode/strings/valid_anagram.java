// // leetcode 242
// class valid_anagram{
//     public static void main(String args[]){
//         String s="anagram";
//         String t="nagaram";
//         boolean res=true;
//         if(s.length()!=t.length()){
//             res=false;
//         }
//         int freq[]=new int[26];
//         for(char c:s.toCharArray()){
//             freq[c-'a']++;
//         }
//         for(char c:t.toCharArray()){
//             freq[c-'a']--;
//         }
//         for(int count:freq){
//             if(count!=0){
//                 res=false;
//             }
//             else{
//                 res=true;
//             }
//         }
//         System.out.print(res);
        
//     }

// }