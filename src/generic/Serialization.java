package generic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialization {
    public static void main(String[] args) throws IOException {
        List<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cars.bin"));) {
            outputStream.writeObject(cars);
        }


    }
}
