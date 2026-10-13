package basic_practices;
import java.util.*;
public class search_twod_Array {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int arr[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int target=s.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==target){
                    found=true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(found){
            System.out.print("found");

        }
        else{ System.out.print(" not found");

        }
        s.close();
    }
    
}
