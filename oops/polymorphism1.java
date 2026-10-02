class Calculator{
    public int add(int a ,int b){
        return a+b;
    }
    public int add(int a ,int b,int c){
        return a+b+c;
    }
    public double add(double a ,double b){
        return a+b;
    }

}
public class polymorphism1 {
    public static void main(String args[]){
        Calculator c=new Calculator();
        System.out.println(c.add(5,4));
        System.out.println(c.add(5,4,1));
        System.out.println(c.add(2.5,3.5));
    }
    
}
