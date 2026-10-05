class boats{
    public static void main(String args[]){
        int people[]={1,2};
        int limit=3;
        int left=0;
        int right=people.length-1;
        int count=0;
        Arrays.sort(people);
        while(left<right){
            if(people[left]+people[right]<=limit){
                left++;
                right--;
            }
            else{
                right--;
            }
            count++;
        }
        System.out.print(count);

    }
}