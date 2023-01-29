import java.util.Scanner;

public class Emboscada {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Número: ");
        int dados = leitor.nextInt();

        System.out.println("Número: ");
        int vidaDoJogador = leitor.nextInt();

        System.out.println("Número: ");
        int ataqueDoJogador= leitor.nextInt();

        System.out.println("Número: ");
        int defesaDoJogador = leitor.nextInt();

        System.out.println("Número: ");
        int vidaDoInimigo= leitor.nextInt();

        System.out.println("Número: ");
        int ataqueDoInimigo = leitor.nextInt();

        //TODO: Crie as condições necessárias para verificar se o jogador vai sobreviver, e contra-atacar, ou morrer;

        vidaDoJogador -= ataqueDoInimigo - (defesaDoJogador + dados);

        if (vidaDoJogador > 0) {

            vidaDoInimigo -= ataqueDoJogador + dados;

            if (vidaDoInimigo <= 0) {
                System.out.println("Jogador sobreviveu e derrotou o inimigo");
            } else {
                System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
            }
        } else {
            System.out.println("Jogador nao sobreviveu");
        }
    }

    }
}
