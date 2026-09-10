import java.util.*;
class longest_seq{
    public static void main(String args[]){
        Integer prev=null;
        int currlen=0;
        int maxcount=0;
        int nums[]={100,4,200,1,3,2};
        TreeSet<Integer> tree=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
        tree.add(nums[i]);
        }
        for(int num:tree){
            if(prev==null||num!=prev+1){
                currlen=1;
            }
            else{
                currlen++;
            }
            maxcount=Math.max(maxcount,currlen);
            prev=num;
        }
        System.out.print(maxcount);
        
        
    }
}