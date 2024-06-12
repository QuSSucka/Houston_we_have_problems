package generic;

import java.io.FileWriter;
import java.io.IOException;

public class _FileWriter2_ {
    public static void main(String[] args) {
        String str = "Что нибудь!";
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\as960\\Desktop\\Houston_we_have_problems\\src\\generic\\Text\\Text1.txt")){
            fileWriter.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
