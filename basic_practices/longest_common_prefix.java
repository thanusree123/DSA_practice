package basic_practices;
import java.util.*;
public class longest_common_prefix {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str[]=new String[3];
        for(int i=0;i<3;i++){
            str[i]=s.next();
         }

        String prefix=str[0];
        for(int i=1;i<3;i++){
        while(!str[i].startsWith(prefix)&&!prefix.isEmpty()){
        prefix=prefix.substring(0,prefix.length()-1);
    }
}
        System.out.print(prefix);
        s.close();
    }
}
