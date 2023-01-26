import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);
      
        if (turno == 'M'){
            System.out.println("Bom dia!");
        }else if (turno == 'V'){
            System.out.println("Boa tarde!");
        }else if (turno == 'N'){
            System.out.println("Boa noite!");
        }else{
            System.out.println("Valor Inválido!");
        }
            

    }
}
