package basic_practices;
import java.util.*;
public class reverse_a_array_strings {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      char []ch=new char[n];
      for(int i=0;i<n;i++){
        ch[i]=s.next().charAt(0);
      }
      int left=0;
      int right=n-1;
      while(left<right){
        char temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
        left++;
        right--;
      }
      System.out.print(Arrays.toString(ch));
      s.close();
    }
    
}
