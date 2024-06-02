package generic;

public class ParameterizedMethods {
    public static void main(String[] args) {
        Integer [] array1 = {1,2,3,4,5,6,7,8,9};
        String [] array2 = {"a","b","c","d","e","f"};
        show(array1);
        System.out.println();
        show(array2);
    }

    private static <T> void show(T[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
