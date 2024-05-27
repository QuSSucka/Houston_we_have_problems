public class FuncOrMeth {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = getSum(array);
        System.out.println(sum);
        Integer a = 0;
        System.out.println(a);
        fu(a);
        System.out.println(a);
        time = System.currentTimeMillis();
        System.out.println(time);
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    private static void fu(Integer x) {
        x++;
        System.out.println(x);

    }
}
