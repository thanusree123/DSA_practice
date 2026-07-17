class trippingRain_water{
    public static void main(String args[]){
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int n=height.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
         rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        int water=0;
        for(int i=0;i<n;i++){
        water+=Math.min(leftmax[i],rightmax[i])-height[i];
        }
        System.out.print(water);
    }
}