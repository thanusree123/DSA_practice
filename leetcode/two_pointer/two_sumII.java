class two_sumII{
    public static void main(String args[]){
        int arr[]={2,7,11,17};
        int left=0;
        int right =arr.length-1;
        int target=9;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.print(left+1,right+1);
                break;
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }

        }
    }
    
}