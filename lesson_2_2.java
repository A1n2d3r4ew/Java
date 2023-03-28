package Java;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.*;

public class lesson_2_2 {

    // public static void main(String[] args) {
       
    //     buildString(6, 'a', 'b');
    
        
    // }
    // public static void buildString(int n, char c1, char c2) {
     
    //         for (int i = 1; i <= n; i++) {
    //             if (i % 2 == 0) {
    //                 System.out.print(c2);
    //             } else {
    //                 System.out.print(c1);
    //             }
    //         }   
    // }
    
    public static void main(String[] args) throws IOException {
        System.out.println(File.separator);
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");

        String text = "Text";
        text = text.repeat(100);
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(bytes);
    }
    
}

// 1.Дано четное число N (>0) и символы c1 и c2. Написать метод,
//  который вернет строку длины N, которая состоит из чередующихся
//  символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
// 2.Создать файл с названием file.txt. Если файл уже есть, 
// то создавать не надо Записать в него Слово "TEXT" 100 раз