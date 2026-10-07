// import java.util.*;
// class StringCompression{
//     public static void main(String args[]){
//         char chars[] = {'a','a','a','b','b','c','c'};
//         int read=0;
//         int write=0;
//         while(read<chars.length){
//             char current =chars[read];
//             int count=0;
//             if(read<chars.length && chars[read]==current){
//                 count++;
//                 read++;
//             }
//             chars[write]=current;
//             write++;
//             if(count>1){
//                 String num=String.valueOf(count);
//                 for(int i=0;i<num.length();i++){
//                     chars[write]=num.charAt(i);
//                     write++;
//                 }
//             }
//         }
//         System.out.print(write);

//     }
// }