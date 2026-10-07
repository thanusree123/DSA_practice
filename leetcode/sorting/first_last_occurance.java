// class first_last_occurance{
//     public static int firstindex(int []arr,int target){
//         int left=0;
//         int right=arr.length-1;
//         int firstindex=0;
//         while(left<=right){
//             int mid=left+(right-left)/2;
//             if(arr[mid]==target){
//                 firstindex=mid;
//                 right=mid-1;
//             }
//             else if(arr[mid]<target){
//                 left=mid+1;
//             }
//             else{
//                 right=mid-1;
//             }
//         }
//         return firstindex;
//     }
//     public static int lastindex(int []arr,int target){
//         int left=0;
//         int right=arr.length-1;
//         int lastindex=0;
//         while(left<=right){
//             int mid=left+(right-left)/2;
//             if(arr[mid]==target){
//                 lastindex=mid;
//                 left=mid+1;
//             }
//             else if(arr[mid]<target){
//                 left=mid+1;
//             }
//             else{
//                 right =mid-1;
//             }
//         }
//         return lastindex;
//     }
//     public static int[] searchrange(int arr[],int target){
//         int first=firstindex(arr,target);
//         int last=lastindex(arr,target);
//         return new int []{first,last};

//     }
//     public static void main(String args[]){
//         int arr[]={1,2,2,2,3,4,5};
//         int target=2;
//         int []result=searchrange(arr,target);
//         System.out.print("["+result[0]+" ,"+result[1]+"]");
//     } 
// }