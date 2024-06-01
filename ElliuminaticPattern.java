
import java.util.Scanner;

public class ElliuminaticPattern{
    public static void patternPrinter(int n) {

        int sum = n * (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            int temp = sum;
            for (int j = 1; j <= i; j++){
                if(j%2==0){
                    
                }
                System.out.print(temp - i + 1 + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Nyumber : ");
        int n = sc.nextInt();
        patternPrinter(n);
    }
}
