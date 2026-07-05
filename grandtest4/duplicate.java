import java.util.*;
class duplicate{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int x:arr){
            if(!list.contains(x)){
                list.add(x);
            }
        }
        System.out.print(list);
        }
    }
