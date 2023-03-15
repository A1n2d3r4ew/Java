package Java;

public class lesson_1_1 {
    // Дан массив nums = [3,2,2,3] и число val = 3. 
    // Если в массиве есть числа, равные заданному,
    //  нужно перенести эти элементы в конец массива. 
    // Таким образом, первые несколько (или все) 
    // элементов массива должны быть отличны от заданного,
    //  а остальные - равны ему.
    public static void main(String[] args) {
        
        int[] arr = {3, 2, 2, 3, 1, 5, 5, 3, 3};
        int val = 3;

        swap(arr, val);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == var) {
        //         int[] arr1 = arr.length - 1;
        //     }
        // }
        // System.out.println(arr1);
    }
    static void swap(int[] arr, int val) {
        int size = arr.length;
        int shift = 1;
        for (int i = 0; i < size && i < size - shift; i++) {
            while (arr[size - shift] == val) {
                shift++;
            }

            if (arr[i] == val) {
                int tmp = arr[i];
                arr[i] = arr[size - shift];
                arr[size - shift] = tmp;
                shift++;
            }
        }
    }
}
