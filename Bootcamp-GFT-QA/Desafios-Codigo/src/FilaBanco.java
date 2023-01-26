import java.util.Scanner;

public class FilaBanco {
    public static void main(String[] args) { 
 
        String[] nomesFila = new String[3]; 
        Scanner nome = new Scanner(System.in); 

     
     int posicao = 0;
    
         do {
            
            System.out.println("Digite um Nome");
             String nomeCliente = nome.next();

             System.out.println("Digite um Nome");
             String nomeCliente2 = nome.next();
             
            System.out.println("Digite um Nome");
             String nomeCliente3 = nome.next();
             
             
             posicao ++;
             System.out.println(nomeCliente + " - " + "esta na posicao: " + posicao);
             posicao ++;
             System.out.println(nomeCliente2 + " - " + "esta na posicao: " + posicao);
             posicao ++;
             System.out.println(nomeCliente3 + " - " + "esta na posicao: " + posicao);
    
             
       
         } while (posicao < 3);   
    
      
      } 
}
