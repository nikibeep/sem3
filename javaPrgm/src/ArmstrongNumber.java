public class ArmstrongNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int sum = 0;
        int temp = num;
        int length = String.valueOf(num).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit, length);
            temp /= 10;
        }

        return sum == num;
    }

    public static int factorial(int num, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        return result;
    }
}
