import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Labarotinis_2 {//Labarotinis_2_3_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int smallestElement = 0;
        boolean isEven = false;
        for (int i : list) {
            if (i % 2 == 0 && i != 0) {
                isEven = true;
                smallestElement = list.get(0);
            }
        }
        if (isEven) {
            for (int i : list) {
                if (i % 2 == 0 && i != 0 && smallestElement > i) {
                    smallestElement = i;
                }
            }
            System.out.print(smallestElement);
        } else {
            System.out.println("No");
        }
    }
}
