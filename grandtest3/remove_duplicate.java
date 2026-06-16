 class remove_duplicate{
    public static int removeduplicate(int arr[]){
        if(arr.length==0){
            return 0;
        }
        int slow=0;
        for(int fast=0;fast<arr.length;fast++){
            if(arr[fast]!=arr[slow]){
                slow++;
                arr[slow]=arr[fast];
            }
        }
        return slow+1;
    }
    public static void main(String args[]){
        int arr[]={1,1,2};
        int k=removeduplicate(arr);
        System.out.println(k);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }

}