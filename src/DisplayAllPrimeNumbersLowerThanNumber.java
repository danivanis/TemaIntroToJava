public class DisplayAllPrimeNumbersLowerThanNumber {

    public static void main(String[] args) {

        int checkedNum = 123;
        int i;
        int tempNum = 0;

        String primeNumbers = "";

        for (i = 1; i < checkedNum; i++){
            int countNum = 0;
            for (tempNum = i; tempNum >= 1; tempNum--){
                if (i % tempNum == 0){
                    countNum = countNum + 1;
                }
            }
            if (countNum == 2){
                primeNumbers = primeNumbers + i + " ";
            }
        }

        System.out.println("The prime numbers lower than " + checkedNum + " are :");
        System.out.println(primeNumbers);
    }

}
