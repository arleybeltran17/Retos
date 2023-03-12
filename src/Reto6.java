import java.util.Random;
import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) throws Exception {
        int i, Adivina,reintentar=1;
        double apuesta;

        Scanner lectura= new Scanner(System.in);

        System.out.println("Tienes 5 Intentos Para Adivinar Si Es Cara o Sello");
        
        System.out.println("Ingrese La Cantidad Que Desea Apostar");
        apuesta=lectura.nextDouble();


        while(reintentar==1){

        for(i=1; i<=5;i++){

            System.out.println(i+"");

            Random generator=new Random();
        int CaraSello= generator.nextInt(2);

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
        apuesta=(apuesta+4500);
        System.out.println("Su Apuesta Se Dobla El Resultado Es: "+apuesta);
       
    } else{
        System.out.println("Perdiste");
        apuesta=(apuesta-4500);
        System.out.println("Su Apuesta Se Reduce El Resultado Es: "+apuesta);
       }

       System.out.println("El Resultado era"+CaraSello);
    
        }

        System.out.println("Quiere Volver A Jugar?, 1=Si 0=No");
    reintentar=lectura.nextInt();

         System.out.println("Jugo "+i+" intentos");
    }

    System.out.println("En Todas Las Rondas Ganaste Un Total De: " +apuesta);

    lectura.close();


    
  }
}
        
    
    

