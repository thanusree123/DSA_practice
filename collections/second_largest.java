import java.util.*;
class second_largest
{
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        int largest=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int x:list)
        {
            if(x>largest)
            {
                sec=largest;
                largest=x;
            }
            else if(x>sec && x!=largest){
                    sec=x;
                }
            }
            System.out.print(sec);
        }
    }
