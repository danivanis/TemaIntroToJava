import org.w3c.dom.ls.LSOutput;

public class SumFirst100NumbersHigherThan0 {

    public static void main(String[] args) {
        int n=100, sum = 0;
        for (int i=1; i>0 && i<=n; ++i){
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
