import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uzdavinys_11 {//Labarotinis_2_11_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Character>> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>(n));
            for (int j = 0; j < n; j++) {
                list.get(i).add('-');
            }
        }
        if (n == 1) {
            System.out.print('O');
        } else {
            for (int i = 0, j = n - 1, upFromMid = n / 2, downFromMid = upFromMid; upFromMid < n - 1; i++, j--, upFromMid++, downFromMid--) {
                list.get(i).set(upFromMid, 'O');// \.
                list.get(upFromMid).set(j, 'O');//./
                list.get(j).set(downFromMid, 'O');//'\
                list.get(downFromMid).set(i, 'O');//'
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(list.get(i).get(j));
                }
                System.out.print('\n');
            }
        }
    }
}
