package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _Map_ {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Aasda");
        list1.add("Basdasd");
        list1.add("asdadC");
        list1.add("Dfergrdfdfdfe");

        List<Integer> list2 = list1.stream().map(elem -> elem.length()).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(list2);

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = Arrays.stream(array1).map(x -> {return x * 3;}).toArray();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
