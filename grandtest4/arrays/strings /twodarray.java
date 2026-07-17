import java.util.*;
class twodarray{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=3;
        int matrix[][]=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        int transpose[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                transpose[i][j]=matrix[j][i]; 
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(transpose[i][j]+" ");
            }
             System.out.println();
        }
       
        
    }
    }
