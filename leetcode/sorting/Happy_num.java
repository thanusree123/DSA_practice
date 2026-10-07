// import java.util.*;
// class Happy_num{
//     public  static boolean ishappy(int n){
//         HashSet<Integer>set=new HashSet<>();
//         while(n!=1){
//             if(set.contains(n)){
//                 return false;
//             }
//             set.add(n);
//             n=sumofsquares(n);
//         }
//         return true;
//     }
//     public  static int sumofsquares(int num){
//         int sum=0;
//         while(num>0){
//             int digit=num%10;
//             sum+=digit*digit;
//             num/=10;
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//         int n=25;
//         System.out.print(ishappy(n));
//     }

// }