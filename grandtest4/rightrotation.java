import java.util.*;
class rightrotation{
    public static void main(String args[]){
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        k=k%n;
        for(int j=0;j<k;j++){
            int last=arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=last;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
           
    }

}