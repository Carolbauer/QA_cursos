import java.util.Scanner;

public class QuantidadeNecessaria {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        // TODO: Retorne o número de pizzas necessárias para atender o pedido.

        for (int i =0; i <T; i++){
            int N = scanner.nextInt();
            System.out.println("Informe o número de fatias necessárias");
            int X = scanner.nextInt();

            int numPizzas = (N * X + 3) / 4;

            System.out.println(numPizzas);
        }



    }
}
