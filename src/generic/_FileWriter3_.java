package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _FileWriter3_ {
    public static void main(String[] args) throws IOException {
        String str = "E:\\Скрины\\Скриншот 11-05-2024 233256.jpg";
        FileInputStream fis = new FileInputStream(str);
        FileOutputStream fos = new FileOutputStream("Test3.jpg");

        int temp;
        while ((temp = fis.read()) != -1) {
            fos.write(temp);
        }
        fis.close();
        fos.close();
        System.out.println("----------------");
        System.out.println("Program ok");

    }
}
