import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Uzdavinys_20 {//Labarotinis_2_20_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = scanner.nextBigDecimal();
        BigDecimal b = scanner.nextBigDecimal();

        a = new BigDecimal(Math.log10(a.doubleValue()));
        a = a.multiply(b);
        a = a.add(BigDecimal.ONE);
        a = a.setScale(0, RoundingMode.DOWN);
        System.out.println(a);

    }
}
