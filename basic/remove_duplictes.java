class remove_duplictes {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3};

        int i = 0;

        for(int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // print unique elements
        for(int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }

        System.out.println("\nCount: " + (i + 1));
    }
}