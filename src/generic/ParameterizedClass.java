package generic;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Example<String> example1 = new Example<String>();
//        example1.field = "Вася";
//        System.out.println(example1.field);
//
//        Example<Integer> example2 = new Example<Integer>();
//        example2.field = 1;
//        System.out.println(example2.field);

        Example<Double> e1 = new Example<>(3.14);
        System.out.println(e1.toString());
    }
}

class Example<T> {
    private T field;

    public Example(T field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return (String) field;
    }
}
