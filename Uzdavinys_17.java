import java.util.*;

public class Uzdavinys_17 {//Labarotinis_2_17_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number;
        int evenCount = 0;
        int unevenCount = 0;
        for (int i = 0; i < n; i++) {
            number = scanner.nextInt();
            if (number % 2 == 0) {
                evenCount++;
            } else {
                unevenCount++;
            }
            if (evenCount >= 2) {
                System.out.println("NELYGINIS");
                break;
            }
            if (unevenCount >= 2) {
                System.out.println("LYGINIS");
                break;
            }
        }

    }
}
