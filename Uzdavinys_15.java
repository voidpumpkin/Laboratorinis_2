package ProcedurinisProgramavimas;


import java.util.*;

public class Labarotinis_2 {//Labarotinis_2_15_2  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.print(executeTask(number, n));
    }

    public static int executeTask(int number, int n) {
        List<Integer> list;
        int min, max;

        for (int a = 1; a < n; a++) {
            list = new ArrayList<Integer>();
            list.add(number / 1000);
            number = number - list.get(0) * 1000;
            list.add(number / 100);
            number = number - list.get(1) * 100;
            list.add(number / 10);
            number = number - list.get(2) * 10;
            list.add(number);


            Collections.sort(list);
            min = list.get(0) * 1000 + list.get(1) * 100 + list.get(2) * 10 + list.get(3);
            Collections.reverse(list);
            max = list.get(0) * 1000 + list.get(1) * 100 + list.get(2) * 10 + list.get(3);

            number = max - min;
        }
        return number;
    }
}
