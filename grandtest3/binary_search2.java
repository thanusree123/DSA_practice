class binary_search2{
    public static void main(String args[]){
        int arr[][]={{1,3,5,7},{8,9,10,11},{12,23,14,15}};
        int row=arr.length;
        int cols=arr[0].length;
        int left=0;
        int target=11;
        int right=(row*cols)-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int midvalue=arr[mid/cols][mid%cols];
            if(midvalue==target){
                System.out.print(mid+" found ");
                return;
            }
            else if(midvalue<target){
                left=mid-1;
            }
            else{
                right=mid+1;
            }
        }
        System.out.print("not found");
    }
}