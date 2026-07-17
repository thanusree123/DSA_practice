import java.util.*;
class spiralmatrix{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int matrix[][]={{1,2,3},{5,6,7},{9,10,11}};
        int top=0;
        int bottom=matrix.length-1;
        int left =0;
        int right=matrix[0].length-1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                System.out.print(matrix[top][j]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(matrix[i][right]+" ");
            }
             right--;
            if(top<=bottom){
            for(int j=right;j>=left;j--){
                System.out.print(matrix[bottom][j]+" ");
            }
             bottom--;
            }
            
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                System.out.print(matrix[i][left]+" ");
                
            }
            left++;
            }
            
        }
    }

}