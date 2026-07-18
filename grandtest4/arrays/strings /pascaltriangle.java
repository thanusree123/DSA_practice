import java.util.*;
class pascaltriangle{
    public static void main(String args[]){
        int n=5;
        ArrayList<ArrayList<Integer>> triangle=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    int value=triangle.get(i-1).get(j-1)+
                    triangle.get(i-1).get(j);
                    row.add(value);
                }
            }
            triangle.add(row);
        }
        System.out.print(triangle);

    }

}