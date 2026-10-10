package basic_practices;
import java.util.*;
public class largest_in_twodarray {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int max=0;
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            max=arr[i][0];
            for(int j=0;j<m;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.print(max);
        s.close();
    }
    
}
