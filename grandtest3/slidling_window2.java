class slidling_window2{
    public static void main(String args[]){
        int arr[]={2,4,2,5,1};
        int target=7;
        int minlen=Integer.MAX_VALUE;
        int currlen=0;
        int currsum=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            currsum+=arr[right];
            while(currsum>=target){
                 currlen=right-left+1;
                minlen=Math.min(minlen,currlen);
                currsum-=arr[left];
                left++;
            }
        }
        if(minlen== Integer.MAX_VALUE){
            System.out.print("0");
        }
        else{
            System.out.print(minlen);
        }
    }
}