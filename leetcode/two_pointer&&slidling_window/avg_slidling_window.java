class avg_slidling_window{
    public static void main(String args[]){
        int arr[]={1,12,-5,-6,50,3};
        int k=4;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxsum=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k]+arr[i];
             maxsum=Math.max(maxsum,sum);
        }
        System.out.print((double)maxsum/k);
    }
}