import javax.swing.*;


//Fazer a divisão de 2 valores inteiros
public class UncheckdException {
    public static  void main(String[] args){

        boolean continueLooping = true;
       do {

       }while (continueLooping);
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
            continueLooping = false;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entada inválida, informe um número inteiro! " + e.getMessage());
            //e.printStackTrace();
        }catch (ArithmeticException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0." + e.getMessage());
        }
        finally {
            System.out.println("CHEGOU NO FINALLY!");
        }while(continueLooping);

        System.out.println("Código Continua... ");
    }

    private static int dividir(int a, int b) {
        return a/b;
    }
}
