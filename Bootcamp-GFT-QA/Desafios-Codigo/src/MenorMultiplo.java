import java.util.Scanner;

public class MenorMultiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Número: ");
        int numero = scanner.nextInt();    

        int minimoMultiplo = 0;
        if (numero % 2 == 0) {
          minimoMultiplo = numero;
        } else {
          minimoMultiplo = numero * 2;
        }
    
        System.out.println("O resultado é:" + minimoMultiplo);
      }
    
}
