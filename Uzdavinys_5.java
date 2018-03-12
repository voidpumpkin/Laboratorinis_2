import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Labarotinis_2 {//Labarotinis_2_5_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int occuranciesOfInt;
        boolean areAllDifferent = true;
        for (int i : list) {
            occuranciesOfInt = 0;
            for (int j : list) {
                if (i == j) {
                    occuranciesOfInt++;
                }
            }
            if (occuranciesOfInt > 1) {
                areAllDifferent = false;
            }
        }
        if(areAllDifferent){
            System.out.println("TAIP");
        }else{
            System.out.println("NE");
        }
    }
}
