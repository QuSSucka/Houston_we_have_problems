import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Lists {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("John");
//        names.add("Jane");
//        names.add("Bob");
//        System.out.println(names);
//        Collections.sort(names);
//        System.out.println(names);
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(1, "Audi", 15000);
        Car car2 = new Car(1, "Audi", 12000);
        Car car3 = new Car(3, "Mercedes", 14000);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
    }
}
class Car implements Comparable<Car> {
    int id;
    String name;
    int price;

    public Car(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        if (this.id != car.id) {
            return Integer.compare(this.id, car.id);
        }
        else{
            if (!Objects.equals(this.name, car.name)) {
                return this.name.compareTo(car.name);
            }
            else {
                return Integer.compare(this.price, car.price);
            }
        }


    }
}