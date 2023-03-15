package Java;

public class lesson_1 {

//     public static void main(String[] args) {
//         System.out.println("Hello, world");
//     }
// }
public static void main(String[] args) {
            // int[] arr = new int[] {1, 1, 0, 1, 1, 1};
            int[] arr = {1, 1, 0, 1, 1, 1};
            int count = 0;
            int best = 0;
            // for (int i : arr) {
            //     if (i == 1)
            //         count ++;
            // }        
            for (int i = 0; i < arr.length; i++) {
                int a = arr[i];
                if (a == 1) {
                    count++;
                } else {
                    if (count > best) {
                        best = count;
                    }
                    count = 0;
                }
            }
            if (count > best) {
                best = count;
            }
            System.out.println(count);
            
        }
} 
    