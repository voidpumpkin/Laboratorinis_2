import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Labarotinis_2 {//Labarotinis_2_9_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<List<Integer>>(n);
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>(m));
            for (int j = 0; j < m; j++) {
                list.get(i).add(scanner.nextInt());
            }
        }
        int biggestInteger = findBiggestIntInTwoDimensionalList(list);
        int rowIndexOfBiggestInteger = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (list.get(i).indexOf(biggestInteger) > 0) {
                rowIndexOfBiggestInteger = i;
            }
        }
        double sum = 0;
        for (int j = 0; j < m; j++) {
            sum += list.get(rowIndexOfBiggestInteger).get(j);
        }
        /*System.out.println(biggestInteger);
        System.out.println(rowIndexOfBiggestInteger);
        System.out.println(sum);*/
        System.out.printf("%.2f", sum / list.get(rowIndexOfBiggestInteger).size());
    }

    private static int findBiggestIntInTwoDimensionalList(List<List<Integer>> list) {
        int biggestInt = list.get(0).get(0);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                if (biggestInt < list.get(i).get(j)) {
                    biggestInt = list.get(i).get(j);
                }
            }
        }
        return biggestInt;
    }
}
