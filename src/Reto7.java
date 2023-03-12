import java.util.Random;
import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) throws Exception {
        int opcionjug,reintentar=1,i;

        double apuesta;

    Scanner juego =new Scanner(System.in);

    System.out.println("Ingrese La Cantidad Que Desea Apostar");
        apuesta=juego.nextDouble();

    while(reintentar==1){

        for(i=1; i<=5;i++){

        System.out.println("Ingrese 0 Es Piedra, 1 Es Papel, 2 Es Tijera, Tiene 5 Intentos Para Adivinar");
        opcionjug=juego.nextInt();

        Random generator=new Random();
        int opcioncop= generator.nextInt(3);

    switch(opcionjug){
        case 0:{
            System.out.println("Piedra");
        }
        break;

        case 1:{
            System.out.println("Papel");
        }
        break;

        case 2:{
            System.out.println("Tijeras");
        }
        break;

        default:{
            System.out.println("Eleccion no existente");
        }

    }

    switch(opcioncop){
        case 0:{
            System.out.println("Piedra");
        }
        break;

        case 1:{
            System.out.println("Papel");
        }
        break;

        case 2:{
            System.out.println("Tijeras");
        }
        break;

        default:{
            System.out.println("Eleccion no existente");
        }
    }
    
    if((opcionjug==0)&&(opcioncop==2)){
        System.out.println("Ganaste");
        apuesta=(apuesta+4500);
    } else if((opcionjug==1)&&(opcioncop==0)){
        System.out.println("Ganaste");
        apuesta=(apuesta+4500);
    }else if((opcionjug==2)&&(opcioncop==1)){
        System.out.println("Ganaste");
        apuesta=(apuesta+4500);
    }else if((opcionjug==0)&&(opcioncop==0)){
        System.out.println("Empate");
        System.out.println(+apuesta);
    }else if((opcionjug==1)&&(opcioncop==1)){
        System.out.println("Empate");
        System.out.println(+apuesta);
    }else if((opcionjug==2)&&(opcioncop==2)){
        System.out.println("Empate");
        System.out.println(+apuesta);
    }else{
        System.out.println("Pierdes");
        apuesta=(apuesta-4500);
    }

    System.out.println("Tu Apuesta Es De: "+apuesta);
}
    System.out.println("En Todas Las Rondas Ganaste Un Total De: " +apuesta);

    System.out.println("Quiere Volver A Jugar?, 1=Si 0=No");
    reintentar=juego.nextInt();

    System.out.println("Jugo "+i+" intentos");   
    }
    System.out.println("El Total De Ganancia o Perdida De Todas Las Rondas Es: " +apuesta);
    
    juego.close();
}
}
    
