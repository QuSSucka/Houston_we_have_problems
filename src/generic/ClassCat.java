package generic;

import java.io.Serializable;

public class ClassCat implements Serializable{

    private String name;

    private String color;

    public ClassCat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ClassCat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
