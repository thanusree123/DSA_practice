import java.util.*;
class sum{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.print(sum);

    }
}