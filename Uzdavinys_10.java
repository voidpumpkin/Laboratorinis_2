import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uzdavinys_10 {//Labarotinis_2_10_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>(n));
            for (int j = 0; j < n; j++) {
                list.get(i).add(scanner.nextInt());
            }
        }
        if (n == 1) {
            System.out.println("No");
        } else {
            int sum = 0;
            for (int j = 0, i = 0; i < n; i++, j++) {
                for (int k = 0; k < j; k++) {
                    sum += list.get(i).get(k);
                }
            }
            System.out.println(sum);
        }
    }
}
