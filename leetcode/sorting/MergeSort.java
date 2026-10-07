// public class MergeSort {

//     static void mergeSort(int[] arr, int low, int high) {

//         if (low >= high) {
//             return;
//         }

//         int mid = low + (high - low) / 2;

//         // Sort left half
//         mergeSort(arr, low, mid);

//         // Sort right half
//         mergeSort(arr, mid + 1, high);

//         // Merge both sorted halves
//         merge(arr, low, mid, high);
//     }

//     static void merge(int[] arr, int low, int mid, int high) {

//         int[] temp = new int[high - low + 1];

//         int i = low;       // left half
//         int j = mid + 1;   // right half
//         int k = 0;         // temp array

//         while (i <= mid && j <= high) {

//             if (arr[i] <= arr[j]) {
//                 temp[k] = arr[i];
//                 i++;
//             } 
//             else {
//                 temp[k] = arr[j];
//                 j++;
//             }

//             k++;
//         }

//         // Remaining elements from left
//         while (i <= mid) {
//             temp[k] = arr[i];
//             i++;
//             k++;
//         }

//         // Remaining elements from right
//         while (j <= high) {
//             temp[k] = arr[j];
//             j++;
//             k++;
//         }

//         // Copy temp back to original array
//         for (int x = 0; x < temp.length; x++) {
//             arr[low + x] = temp[x];
//         }
//     }

//     public static void main(String[] args) {

//         int[] arr = {8, 3, 5, 4};

//         mergeSort(arr, 0, arr.length - 1);

//         for (int x : arr) {
//             System.out.print(x + " ");
//         }
//     }
// }