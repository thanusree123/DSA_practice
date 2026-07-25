class nextpermutation
{
        public static void nextpermutation(int []nums)
        {
            int n=nums.length;
            int pivot=-1;
            for(int i=n-2;i>=0;i--){
                if(nums[i]<nums[i+1]){
                    pivot=i;
                    break;
                }
            }
           if(pivot!=-1){
            for(int i=n-1;i>pivot;i--){
                if(nums[i]>nums[pivot]){
                    int temp=nums[i];
                    nums[i]=nums[pivot];
                    nums[pivot]=temp;
                    break;
                }
            }
           }
           int left=pivot+1;
           int right=n-1;
           while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
           }
        }
    public static void main(String args[]){
        int nums[]={1,2,7,4,3,1};
        nextpermutation(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
