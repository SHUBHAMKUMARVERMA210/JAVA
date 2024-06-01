import java.io.IOException;
import java.util.Scanner;

public class PatternGenerator {

    public static void patter(int n) {
        int num = n * (n + 1) / 2;
        int tempVar = num;
        int row, column;

        int[][] matrixOutput = new int[5][5];
        // int[][] pattern = new int[5][5];

        for (int i = n; i >= 1; i--) {
            row = 0;
            row++;

            if (i % 2 != 0) {
                for (int j = i; j >= 1; j--) {
                    column = 0;
                    column++;
                    tempVar = num;
                    System.out.print(tempVar + " ");
                    matrixOutput[row][column] = tempVar;
                    tempVar = tempVar - 1;
                    num--;
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    column = 0;
                    column++;
                    System.out.print(tempVar - i + j + " ");
                    matrixOutput[row][column] = tempVar - i - j;
                    num--;
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixOutput[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for N: ");
        int n = scanner.nextInt();
        patter(n);
    }
}
