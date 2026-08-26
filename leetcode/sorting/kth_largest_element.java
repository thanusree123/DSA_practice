class kth_largest_element{
    static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pivotindex=partition(arr,low,high);
                quicksort(arr,low,pivotindex-1);
                quicksort(arr,pivotindex+1,high);
        }  
    }
        static int partition(int arr[], int low, int high) {

    int randomindex = low +
            (int)(Math.random() * (high - low + 1));

    int temp = arr[randomindex];

    arr[randomindex] = arr[high];

    arr[high] = temp;

    int pivot = arr[high];

    int i = low - 1;

    for (int j = low; j < high; j++) {

        if (arr[j] < pivot) {

            i++;

            int swapTemp = arr[i];

            arr[i] = arr[j];

            arr[j] = swapTemp;
        }
    }

    int temp1 = arr[i + 1];

    arr[i + 1] = arr[high];

    arr[high] = temp1;

    return i + 1;
}
        public static void main(String args[])
        {
            int arr[]={3,2,3,1,2,4,5,5,6};
            quicksort(arr,0,arr.length-1);
            int k=4;
            int n=arr.length;
            int num=n-k;
            System.out.print(arr[num]);
        }
       
}
// this we get time exceed in 215
// so this
class Solution {

    static int quickselect(int nums[], int low, int high, int target) {

        while (low <= high) {

            int pivotindex = partition(nums, low, high);

            if (pivotindex == target) {
                return nums[pivotindex];
            }

            else if (pivotindex < target) {
                low = pivotindex + 1;
            }

            else {
                high = pivotindex - 1;
            }
        }

        return -1;
    }

    static int partition(int nums[], int low, int high) {

        int randomindex = low +
                (int)(Math.random() * (high - low + 1));

        int temp = nums[randomindex];

        nums[randomindex] = nums[high];
        nums[high] = temp;

        int pivot = nums[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (nums[j] < pivot) {

                i++;

                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }

    public int findKthLargest(int[] nums, int k) {

        int target = nums.length - k;

        return quickselect(nums, 0, nums.length - 1, target);
    }
}