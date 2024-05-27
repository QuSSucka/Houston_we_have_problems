public class Task {
    public static void main(String[] args) {
        int number = 123456;
        System.out.println(number);
        String numStr1 = String.valueOf(number);
        StringBuilder numStr2 = new StringBuilder();
        for (int i = numStr1.length() - 1; i >= 0 ; i--) {
            numStr2.append(numStr1.charAt(i));
        }
        int number2 = Integer.parseInt(numStr2.toString());
        System.out.println(number2);
    }
}

