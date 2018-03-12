import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Labarotinis_2 {//Labarotinis_2_7_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n < 2) {
            System.out.println("No");
        } else {
            List<Integer> list = new ArrayList<Integer>(n * m);
            for (int i = 0; i < n * m; i++) {
                list.add(scanner.nextInt());
            }
            int biggestInt = list.get(m);
            for (int i = m + 1; i < m * 2; i++) {
                if (list.get(i) > biggestInt) {
                    biggestInt = list.get(i);
                }
            }
            System.out.print(biggestInt);
        }
    }
}
