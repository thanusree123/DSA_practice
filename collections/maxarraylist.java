import java.util.*;
public class maxarraylist{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num=0;
        int max=0;
        for(int i=0;i<n;i++){
            num=s.nextInt();
            list.add(num);
        }
            for(int i=1;i<list.size();i++){
                if(list.get(i)>max){
                    max=list.get(i);
                }
            }
            System.out.print(max); 
        
    }
}