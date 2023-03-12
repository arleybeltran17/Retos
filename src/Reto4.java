import java.util.Random;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) throws Exception {
        int opcionjug;
    Random generator=new Random();
        int opcioncop= generator.nextInt(3);

    Scanner juego =new Scanner(System.in);
    
    System.out.println("Ingrese 0 Es Piedra, 1 Es Papel, 2 Es Tijera");
    opcionjug=juego.nextInt();

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
    } else if((opcionjug==1)&&(opcioncop==0)){
        System.out.println("Ganaste");
    }else if((opcionjug==2)&&(opcioncop==1)){
        System.out.println("Ganaste");
    }else if((opcionjug==0)&&(opcioncop==0)){
        System.out.println("Empate");
    }else if((opcionjug==1)&&(opcioncop==1)){
        System.out.println("Empate");
    }else if((opcionjug==2)&&(opcioncop==2)){
        System.out.println("Empate");
    }else{
        System.out.println("Pierdes");
    }

    juego.close();
    }
}