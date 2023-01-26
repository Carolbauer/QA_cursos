import java.util.Scanner;

public class PercentualDesconto {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
         
        System.out.println("valor do produto:");
        float M = input.nextInt();

        System.out.println("valor do produto com desconto já aplicado:");
        float D = input.nextInt();  
          
          float calc1 = 100 / M;
          float calc2 = M - D;
          float percentual = calc1 * calc2;
    
            int percentual1 = Math.round(percentual);
    
            
            System.out.println("O desconto foi de " + percentual1 + "%");
      
    }
}
