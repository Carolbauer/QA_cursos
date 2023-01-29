import java.util.Arrays;
import java.util.Scanner;

public class DiferencaDigitos {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe um número: ");
    int numero = scan.nextInt();

    //TODO: Retorne a diferença entre o produto e a soma dos dígitos.

    String numeroEmString = String.valueOf(numero);
    String[] split = numeroEmString.split("");

    int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

    int multiplicacao = multiplicacaoDigitos(ints);
    int soma = somaDigitos(ints);
    int resultado = multiplicacao - soma;
    System.out.println("resultado: " + resultado);
}

public static int multiplicacaoDigitos(int[] ints) {
    int multiplicacao = 1;
    for (int i = 0; i < ints.length; i++) {
        multiplicacao *= ints[i];
    }

    return multiplicacao;
}

public static int somaDigitos(int[] ints) {
    int soma = 0;
    for (int i = 0; i < ints.length; i++) {
        soma += ints[i];
    }

    return soma;
}
}
