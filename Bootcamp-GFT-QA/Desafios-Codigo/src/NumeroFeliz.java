import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroFeliz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = scan.nextInt();
        //TODO: Desenvolva um algoritmo que retorne se o número é feliz ou não



        List<Integer> checkedNumbers = new ArrayList<>();

        while (n != 1 && !checkedNumbers.contains(n)) {
            checkedNumbers.add(n);

            int sum = 0;

            while (n > 0) {
                int num = n % 10;
                sum += num * num;
                n /= 10;
            }

            n = sum;
        }

        if (n == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
