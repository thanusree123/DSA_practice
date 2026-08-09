class revstring{
    public static String rev(String s){
        if(s.length()==0){
            return " ";
        }
        return rev(s.substring(1))+s.charAt(0);
    }
    public static void main(String args[]){
        String str="hello";
        System.out.print(rev(str));
    }
}