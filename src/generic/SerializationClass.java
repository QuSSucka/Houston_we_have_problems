package generic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class SerializationClass {
    public static void main(String[] args) throws IOException {
        ClassCat cat1 = new ClassCat("Barsik", "black");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cat.bin"))){
            outputStream.writeObject(cat1);
            System.out.println("Object written to cat.bin");
        }
    }
}
