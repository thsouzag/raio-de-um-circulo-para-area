import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
// Variavel
  double  area , raio , pi = 3.14159;
          
  // processamento
  System.out.println("Digite o valor do raio :");
  raio = console.nextDouble();
  area = pi * Math.pow(raio, 2);
  //saida 
 System.out.printf("\n A Area do circulo e !\n"  + area);
    
  }
}