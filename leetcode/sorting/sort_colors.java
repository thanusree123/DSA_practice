// import java.util.*;
// class sort_colors{
//    public static void main(String args[]){
//     int arr[]={2,02,1,1,0};
//         int low=0;
//         int mid=0;
//         int high =arr.length-1;
//         while(low<=high){
//             if(arr[mid]==0){
//                 swap(arr,low,high);
//                     low++;
//                     mid++;
//             }
//                 else if(arr[mid]==1){
//                     mid++;
//                 }
//                 else{
//                     swap(arr,mid,high);
//                     high--;
//                 }
//         }
//         }
//             static void swap(int arr[],int i,int j){
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//             }
// }