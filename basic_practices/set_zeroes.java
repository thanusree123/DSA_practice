package basic_practices;
import java.util.*;
public class set_zeroes {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[][]=new int[n][m];
        boolean []row=new boolean[n];
        boolean []cols=new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            arr[i][j]=s.nextInt();
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i][j]==0){
                row[i]=true;
                cols[j]=true;
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(row[i]||cols[j]){
                arr[i][j]=0;
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    s.close();
    }
    
}
