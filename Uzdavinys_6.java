import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uzdavinys_6 {//Labarotinis_2_3_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>(m));
            for (int j = 0; j < m; j++) {
                list.get(i).add(scanner.nextInt());
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += list.get(i).get(j);
            }
        }

        System.out.printf("%.2f", sum / (m * n));
    }
}
