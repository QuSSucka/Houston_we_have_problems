package generic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _FileWriter_ {
    public static void main(String[] args) throws IOException {
        String str = "This is a test";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\\Users\\as960\\Desktop\\Houston_we_have_problems\\src\\generic\\Text\\Text1.txt");

            fileWriter.write(str);

//            for (int i = 0; i < str.length(); i++) {
//                fileWriter.write(str.charAt(i));
//            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            assert fileWriter != null;
            fileWriter.close();
        }

        FileReader fileReader = null;
        fileReader = new FileReader("C:\\Users\\as960\\Desktop\\Houston_we_have_problems\\src\\generic\\Text\\Text1.txt");
        int temp;
        while((temp = fileReader.read()) != -1) {
            System.out.print((char) temp);
        }
        System.out.println( );
        fileReader.close();
        System.out.println("File written successfully");
    }
}
