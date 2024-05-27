import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {12,234,345,546,567,234,453,231};
        double[] darr = new double[arr.length];
        int[] j = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(arr[arr.length-1]); // Найти последний элемент
        System.out.println(Arrays.toString(darr));
        darr[0] = arr[0];
        System.arraycopy(arr,0,j,0,arr.length);
        System.out.println(Arrays.toString(j));
        System.out.println("____________________________________");
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length/2; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[arr2.length-1-i];
            arr2[arr2.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
