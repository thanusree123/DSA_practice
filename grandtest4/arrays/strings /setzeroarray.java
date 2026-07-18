import java.util.*;
class setzeroarray{
    public static void setZero(int matrix[][]){
        int rowlen=matrix.length;
        int colslen=matrix[0].length;
        boolean[] rows=new boolean[matrix.length];
        boolean[] cols=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows[i]=true;
                    cols[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rows[i]||cols[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int matrix[][]={{1,2,3},
                        {4,0,6},
                        {7,8,9}
                    };
                    setZero(matrix);
                    for(int i=0;i<matrix.length;i++){
                        for(int j=0;j<matrix[0].length;j++){
                            System.out.print(matrix[i][j]+" ");
                        }
                        System.out.println();
                    }
        

    }
}