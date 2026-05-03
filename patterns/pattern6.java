import java.util.*;
class pattern6{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                count++;
                System.out.print(count);
            }
            System.out.println();
        }

    }
}