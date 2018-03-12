package ProcedurinisProgramavimas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Labarotinis_2 {//Labarotinis_2_4_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int biggestElement = 0;
        boolean isNegative = false;
        for (int i : list) {
            if (i < 0) {
                isNegative = true;
                biggestElement = i;
            }
        }
        if (isNegative) {
            for (int i : list) {
                if (i < 0 && biggestElement < i) {
                    biggestElement = i;
                }
            }
            int indexOfBiggestNegativeInt = list.indexOf(biggestElement);
            System.out.print(indexOfBiggestNegativeInt + 1);
        } else {
            System.out.println("NERA");
        }
    }
}
