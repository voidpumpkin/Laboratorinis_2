import java.util.*;

public class Uzdavinys_18 {//Labarotinis_2_18_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double a, b, c;
        for (int i = 0; i < n; i++) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            System.out.println(getEquadraticEquationSolutionAmount(a, b, c));
        }
    }

    private static int getEquadraticEquationSolutionAmount(double a, double b, double c) {
        if(a == 0 && b == 0 && c != 0){
            return 0;
        }else if((a == 0 && b == 0 && c == 0)) {
            return -1;
        }else if((a == 0 && b != 0 && c == 0)||(a == 0 && b != 0 && c != 0)){
            return 1;
        }else {
            double discriminant = (b * b) - (4 * a * c);
            //System.out.println("dis "+discriminant);
            if (discriminant < 0) {
                return 0;
            } else if (discriminant == 0) {
                return 1;
            } else {
                return 2;
            }
        }
    }
}
