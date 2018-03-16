import java.util.*;

public class Labarotinis_2 {//Labarotinis_2_16_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        List<Integer> offensiveNumbers = new ArrayList<>();
        if (list.get(0) > list.get(1) && list.get(0) > 0) {
            offensiveNumbers.add(list.get(0));
        }
        if (list.get(n-1) > list.get(n-2) && list.get(n-1) > 0) {
            offensiveNumbers.add(list.get(n-1));
        }
        for (int i = 1; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1) && list.get(i) > list.get(i - 1) && list.get(i) > 0) {
                offensiveNumbers.add(list.get(i));
            }
        }
        if (offensiveNumbers.size() == 0) {
            System.out.println("NO");
        } else {
            Collections.sort(offensiveNumbers);
            System.out.println(offensiveNumbers.get(0));
        }
    }
}
