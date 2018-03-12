import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Labarotinis_2 {//Labarotinis_2_2_1  final num is iteration

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }
        double sum=0;
        double count=0;
        for(int i:list){
            if(i<0){
                sum+=i;
                count++;
            }
        }
        if(count==0){
            System.out.println("NO");
        }else {
            double rezult=sum/count;
            System.out.printf("%.2f",rezult);
        }
    }
}
