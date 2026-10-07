import java.util.*;
public class evenarraylist {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n=s.nextInt();
        int num=0;
        int count=0;
        for(int i=0;i<n;i++){
            num=s.nextInt();
            list.add(num);
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                count++;
            }
        }
        System.out.print(count);

    }
    
}
