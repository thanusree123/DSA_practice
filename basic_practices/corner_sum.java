package basic_practices;
import java.util.*;
public class corner_sum {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==m-1||j==0||j==n-1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.print(sum);
        s.close();
    }
    
}
