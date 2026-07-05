import java.util.*;
class countE_O{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int ecount=0;
        int ocount=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                ecount++;
            }
            else{
                ocount++;
            }
        }
        System.out.println(ecount);
        System.out.print(ocount);

    }

}
    
