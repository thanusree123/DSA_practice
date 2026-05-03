import java.util.*;
class pattern8{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }


    }
}