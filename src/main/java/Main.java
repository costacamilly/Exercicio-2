import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira X:");
    int x = sc.nextInt();
    System.out.println("Insira Y:");
    int y = sc.nextInt();
    int nulo = 0;

    while (x != nulo && y != nulo) {

      if (x > 0 && y > 0) {
        System.out.println("Primeiro Quadrante");
      }
      if (x < 0 && y > 0) {
        System.out.println("Segundo Quadrante");
      }
      if (x < 0 && y < 0) {
        System.out.println("Terceiro Quadrante");
      }

      if (x > 0 && y < 0) {
        System.out.println("Quarto Quadrante");

      }
      
    }

    sc.close();
  }

}