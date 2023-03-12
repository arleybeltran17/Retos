import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) throws Exception {

        int Adivina;
        double apuesta;

        Random generator=new Random();
        int CaraSello= generator.nextInt(2);

        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese La Cantidad Que Desea Apostar");
        apuesta=lectura.nextDouble();

        System.out.println("Adivina Si Es Cara=1 O Sello=0");
        Adivina=lectura.nextInt();

        switch(Adivina){
            case 0:{
                System.out.println("Sello");
            }
            break;

            case 1:{
                System.out.println("Cara");
            }
            break;

            default:{
                System.out.println("El Valor Insertado No Es Valido");
            }
        }

       if (CaraSello==Adivina){
        System.out.println("Ganaste");
        apuesta=(apuesta+apuesta);
        System.out.println("Su Apuesta Se Dobla El Resultado Es: "+apuesta);
       } else{
        System.out.println("Perdiste");
        apuesta=(apuesta-apuesta);
        System.out.println("Su Apuesta Se Reduce El Resultado Es: "+apuesta);
       }
       
       System.out.println("El Resultado era"+CaraSello);
       
       
       lectura.close();
   
    }
}


    

   

        

        
            
    

