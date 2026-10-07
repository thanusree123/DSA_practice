// class characterreplacement{
//     public static void main(String args[]){
//         String s="AABABBA";
//         int k=1;
//         int freq[]=new int[26];
//         int left=0;
//         int maxlen=0;
//         int maxfreq=0;
//         for(int right=0;right<s.length();right++){
//             int index=s.charAt(right)-'A';
//             freq[index]++;
//             maxfreq=Math.max(maxfreq,freq[index]);
//             while((right-left+1)-maxfreq>k){
//                 freq[s.charAt(left)-'A']--;
//                 left++;
//             }
//             maxlen=Math.max(maxlen,right-left+1);
//         }

//         System.out.print(maxlen);
       

//     }
// }