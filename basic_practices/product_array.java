package basic_practices;

        import java.util.*;
        
        public class product_array{
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
                int n = sc.nextInt();
                int[] arr = new int[n];
        
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
        
                int[] result = new int[n];
                int leftProduct = 1;
        
                for (int i = 0; i < n; i++) {
                    result[i] = leftProduct;
                    leftProduct = leftProduct * arr[i];
                }
        
                // Step 2: Multiply by suffix products
                int rightProduct = 1;
        
                for (int i = n - 1; i >= 0; i--) {
                    result[i] = result[i] * rightProduct;
                    rightProduct = rightProduct * arr[i];
                }
        
                System.out.println(Arrays.toString(result));
        
                sc.close();
            }
        }
