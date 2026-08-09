class factorial{
    public static int fun(int n){
        if(n==1){
            return 1;
        }
        return n*fun(n-1);
    }
    public static void main(String args[]){
        System.out.print(fun(5));
    }
}