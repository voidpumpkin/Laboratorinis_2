import java.util.*;

public class Labarotinis_2 {//Labarotinis_2_17_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a, b, c;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            System.out.println(getEquadraticEquationSolutionAmount(a, b, c));
        }
    }

    public static int getEquadraticEquationSolutionAmount(int a, int b, int c) {
        if(a == 0 && b == 0 && c != 0){
            return 0;
        }else if((a == 0 && b == 0 && c == 0)) {
            return -1;
        }else if((a == 0 && b != 0 && c == 0)||(a == 0 && b != 0 && c != 0)){
            return 1;
        }else {
            int discriminant = (b * b) - (4 * a * c);
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
