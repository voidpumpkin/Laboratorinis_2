import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uzdavinys_14 {//Labarotinis_2_14_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        int biggestInteger=-1000001;
        boolean bigestNotDuplicateExists=false;
        for (int i :list) {
            if(biggestInteger<i && list.indexOf(i) == list.lastIndexOf(i)) {
            biggestInteger=i;
            bigestNotDuplicateExists=true;
            }
        }
        if(bigestNotDuplicateExists) {
            System.out.print(biggestInteger);
        }else{
            System.out.println("NO");
        }
    }
}
