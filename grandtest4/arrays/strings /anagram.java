import java.util.*;
class anagram{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        if(str1.length()!=str2.length()){
            System.out.print("no");
            return;
        }
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }


    }
}