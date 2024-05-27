public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));

        int[][] myArray = {{1, 2, 3, 4}, {5, 6, 7 ,8, 123}, {9, 10, 11, 12}};
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
