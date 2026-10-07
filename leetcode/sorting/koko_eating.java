// class koko_eating{
//     public static int eatingspeed(int piles[],int h){
//         int left=1;
//         int right=0;
//         for(int pile:piles){
//             right=Math.max(right,pile);
//         }
//         int answer=right;
//         while(left<=right){
//             int speed=left+(right-left)/2;
//             long hours=hoursneeded(piles,speed);
//             if(hours<=h){
//                 answer=speed;
//                 right=speed-1;
//             }
//             else{
//                 left=speed+1;
//             } 
//         }
//         return answer;
//     }
//     public static long hoursneeded(int[]piles,int speed){
//         long hours=0;
//         for(int pile:piles){
//             hours+=(pile+speed-1)/speed;

//         }
//         return hours;
//     }
//     public static void main(String args[]){
//         int piles[]={3,6,7,11};
//         int h=8;
//         System.out.print(eatingspeed(piles,h));
//     }
// }