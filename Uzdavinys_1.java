import java.util.Scanner;

public class Uzdavinys_1 {//Labarotinis_2_1_1  final num is iteration
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += scanner.nextInt();
        }
        System.out.print(sum);
    }
}
