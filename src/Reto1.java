import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) throws Exception {
        double  C,K;
        int G=13;
        double Kg;
        double kg1=1000;
        int Cantpersonas=0;
         Scanner grados = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de grados Centigrados a convertir:");
    C= grados.nextDouble();

    System.out.println("Ingrese la cantidad de personas para la torta");
    Cantpersonas=grados.nextInt();

    G= Math.abs(G*Cantpersonas);

    Kg= Math.abs(G/kg1);

    K = C + 273.15;
      
      
      System.out.println(C+"Grados Centigrados Equivalen A:"+K+"Grados Kelvin");
      
      System.out.println("La cantidad de Kilogramos para la torta es:" +Kg+ "Kg");

      grados.close();
      
      

    }
}
