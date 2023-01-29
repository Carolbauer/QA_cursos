import java.util.Scanner;

public class FlechaEscudoEspada {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Vez do Jogador");
        int jogadaJogador = leitor.nextInt();

        System.out.println("Vez do Inimigo");
        int jogadaInimigo = leitor.nextInt();

        //TODO: Crie as condições necessárias para verificar quem vencerá o embate;
        if (jogadaJogador == 2 && jogadaInimigo == 1 ||
                jogadaJogador == 3 && jogadaInimigo == 2 ||
                jogadaJogador == 1 && jogadaInimigo == 3) {
            System.out.println("Ganhou");
        }

        else if (jogadaJogador == jogadaInimigo) {
            System.out.println("Empatou");

        } else {
            System.out.println("Perdeu");
        }

    }
}
