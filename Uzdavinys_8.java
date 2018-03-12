import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Labarotinis_2 {//Labarotinis_2_8_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<List<Integer>>(n);
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>(m));
            for (int j = 0; j < m; j++) {
                list.get(i).add(scanner.nextInt());
            }
        }
        if (k > m) {
            System.out.println("NO");
        } else {
            long sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = k; j < m; j++) {
                    sum += list.get(i).get(j);
                }
            }
            System.out.print(sum);
        }
    }
}
