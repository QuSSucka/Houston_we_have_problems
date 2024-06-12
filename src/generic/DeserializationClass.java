package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {
    public static void main(String[] args) {
        ClassCat cat;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cat.bin"))){
            cat = (ClassCat) ois.readObject();
            System.out.println(cat.toString());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
//https://www.youtube.com/watch?v=aUDnN-3PlA4 Класс FIle. getAbsolutePath()
//https://www.youtube.com/watch?v=4t6JjbfndkA Класс FIle. isAbsolute, isFile, isFolder, exists.
//https://www.youtube.com/watch?v=h1zoSQlmoH0 Класс FIle. createNewFile, mkdir, length, listFiles.
//https://www.youtube.com/watch?v=yW6Yx8NVZCU&list=PLV_vplloSltHDwoVGDMyWHROOYJ5co8DB&index=150 enum
//https://www.youtube.com/watch?v=nDfxaEFIFPw&list=PLV_vplloSltHDwoVGDMyWHROOYJ5co8DB&index=151
//https://www.youtube.com/watch?v=Jpq2Ek2tShc&list=PLV_vplloSltHDwoVGDMyWHROOYJ5co8DB&index=152 Рефлексия. Reflection.