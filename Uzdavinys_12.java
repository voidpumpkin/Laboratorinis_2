import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Labarotinis_2 {//Labarotinis_2_12_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<List<Integer>>(n);
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>(n));
            for (int j = 0; j < n; j++) {
                list.get(i).add(scanner.nextInt());
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(list.get(i).get(j));
                if (i != 0) {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }

    }
}
