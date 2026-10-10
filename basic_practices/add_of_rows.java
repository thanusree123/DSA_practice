package basic_practices;
import java.util.*;
public class add_of_rows {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int sum=0;
        int startrow=s.nextInt();
        int startcols=s.nextInt();
        int endrow=s.nextInt();
        int endcols=s.nextInt();
        for(int i=startrow;i<=endrow;i++){
            int firstCol = (i == startrow) ? startcols : 0;
            int lastCol = (i == endrow) ? endcols : m - 1;
            for(int j=firstCol;j<=lastCol;j++){
                sum+=arr[i][j];
            }
        }
        System.out.print(sum);
        s.close();
    }
    
}
