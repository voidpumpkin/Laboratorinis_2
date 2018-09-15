import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uzdavinys_13 {//Labarotinis_2_13_1  final num is iteration

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
        if (n < 3) {
            System.out.println("Ne");
        } else {
            List<Integer> listOfIntegersThatFitRequerements = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = n - 1; j > n - 1 - i; j--) {
                    if (j != i) {
                        listOfIntegersThatFitRequerements.add(list.get(i).get(j));
                    }
                }
            }
            Collections.sort(listOfIntegersThatFitRequerements);
            //System.out.print(listOfIntegersThatFitRequerements);
            System.out.print(listOfIntegersThatFitRequerements.get(listOfIntegersThatFitRequerements.size() - 1));
        }
    }
}
