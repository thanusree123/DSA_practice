class sum{
    public static int  fun(int n){
        int sum=0;
        if(n==0){
            return 0;
        }
        return n+fun(n-1);
    }
    public static void main(String args[]){
        System.out.print(fun(5));
    }
}