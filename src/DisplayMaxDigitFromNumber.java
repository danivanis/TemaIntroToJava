public class DisplayMaxDigitFromNumber {
    public static void main(String[] args) {

        int n = 6824925;
        int maxDigit = 0;

        while (n != 0){

            int remainder = n % 10;

            maxDigit = Math.max(remainder, maxDigit);

            n = n/10;
        }

        System.out.println("The max digit from the number is " + maxDigit);
    }
}
