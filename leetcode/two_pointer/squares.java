class squares{
    public static void main(String args[]){
        int arr[]={-4,-1,0,3,10};
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+arr[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}