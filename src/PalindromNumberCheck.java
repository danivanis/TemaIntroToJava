public class PalindromNumberCheck {

    public static void main(String[] args) {

        int num = 12321;
        int revNum = 0;
        int tempNum = num;

        while (num > 0) {
            revNum = revNum * 10;
            revNum = revNum + num % 10;
            num = num/10;
        }

        if (revNum == tempNum){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is NOT palindrome");
        }


    }
}
