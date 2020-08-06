import org.w3c.dom.ls.LSOutput;

public class SumFirst100NumbersHigherThan0 {

    public static void main(String[] args) {
        int n=100, sum = 0;
        for (int i=1; i>0 && i<=n; ++i){
            sum += i;
        }
        int sum2 = n * (n+1) / 2;
        System.out.println("The sum of the first 100 numbers higher than 0 is " + sum);
        System.out.println("The second version of the sum of the numbers between 0 and 100 is " + sum2);
    }

}
