import java.util.*;
public class searcharraylist {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        int n=s.nextInt();
        int num=0;
        int target=30;
        for(int i=0;i<n;i++){
            num=s.nextInt();
            list.add(num);
        }
        for(int i=0;i<n;i++){
            if(list.contains(target)){
                System.out.print("found");
                return;
            }
            else{
                System.out.print(" not found");
                return;
            }
        }
    }
    
}
