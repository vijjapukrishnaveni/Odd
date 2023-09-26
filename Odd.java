public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 7; i <= 21; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of odd numbers is: " + sum);
    }
}
