
import java.util.Scanner;

public class Beecrowd1174 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        float A[] = new float[100];
        for (int i = 0; i < 100; i++) {
            A[i] = scanner.nextFloat();
            if (A[i] <= 10) {
                System.out.printf("A[%d] = %.1f%n", i, A[i]);
            }
        }
    }
}
