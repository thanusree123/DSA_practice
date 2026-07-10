import java.util.*;
class countchar{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int vowels=0;
        int constant=0;
        int digits=0;
        int special=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length()-1;i++){
            char ch=str.charAt(i);
             if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else{
                constant++;
            }
             }
             else if(ch>='0' && ch<='9'){
                digits++;
            }
            else if(ch!=' '){
                special++;
            }

        }
        System.out.print(vowels);
        System.out.println(constant);
        System.out.println(digits);
        System.out.println(special);
    }

}