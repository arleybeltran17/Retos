import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) throws Exception {

        int docident,tipodoc,fechanaci,edad,otro=1, Registro;
        String nombre,pais,ciudad;

        //numident1=123456,numident2=678901,numident3=102866//
        //clave=12309,clave2=190238,clave3=908765//


        int numident,clave;
        
        Scanner lectura = new Scanner(System.in);

        while(otro==1){

            System.out.println("Se Encuentra Registrado? 1=Si 0=No");
            Registro=lectura.nextInt();

            if(Registro==1){

                System.out.println(" Ingrese Numero De Documento");
                numident=lectura.nextInt();

                if(numident==123456){
                    System.out.println("Ingrese Su Contraseña");
                    clave=lectura.nextInt();

                    if(clave==908765){
                        System.out.println("Bienvenido Al Sistema");
                    }

                }else if(numident==67890){
                    System.out.println("Ingrese Su Contraseña");
                    clave=lectura.nextInt();
                    if(clave==12309){
                        System.out.println("Bienvenido Al Sistema");
                    }

                }else if(numident==102866){
                    System.out.println("Ingrese Su Contraseña");
                    clave=lectura.nextInt();
                    if(clave==190238){
                        System.out.println("Bienvenido Al Sistema");

                    }

                }else{
                    System.out.println("Error");
                }

            }else if(Registro==0){

                System.out.println("Ingrese Su Nombre Completo");
        nombre=lectura.next();

        System.out.println("Ingrese Tipo De Documento, 1=CC, 2= TI, 3=Pasaporte, 4= Cedula Extranjera");
        tipodoc=lectura.nextInt();

        switch(tipodoc){

            case 1:{
                System.out.println("Eligio Cedula De Cuidadania");

                System.out.println("Digite El Numero De Documento");
                docident=lectura.nextInt();

                System.out.println("El Numero De Documento Es: "+docident);

            }
            break;

            case 2:{
                System.out.println("Eligio Tarjeta De Identidad");

                System.out.println("Digite El Numero De Documento");
                docident=lectura.nextInt();

                System.out.println("El Numero De Documento Es: "+docident);
            }
            break;

            case 3:{
                System.out.println("Eligio Pasaporte");

                System.out.println("Digite El Numero De Documento");
                docident=lectura.nextInt();

                System.out.println("El Numero De Documento Es: "+docident);
            }
            break;

            case 4:{
                System.out.println("Eligio Cedula De Extranjeria");

                System.out.println("Digite El Numero De Documento");
                docident=lectura.nextInt();

                System.out.println("El Numero De Documento Es: "+docident);
            }
            break;

            default:{
                System.out.println("Opcion No Valida, Vuelva a Intentar");
            }
            break;

        }

        System.out.println("Ingrese Su Edad");
        edad=lectura.nextInt();

        System.out.println("Ingrese Fecha De Nacimiento");
        fechanaci=lectura.nextInt();

        System.out.println("Ingrese El Pais Donde Vive");
        pais=lectura.next();

        System.out.println("Ingrese La Ciudad Donde Vive");
        ciudad=lectura.next();


        System.out.println("Su Nombre Es: "+nombre);
        System.out.println("Su Edad Es: "+edad);
        System.out.println("Tipo De Documento: "+tipodoc);
        System.out.println("La Fecha De Nacimeinto Es: "+fechanaci);
        System.out.println("Su Pais Es: "+pais);
        System.out.println("Su Ciudad Es: "+ciudad);
         }
        
        System.out.println("Desea Registrar Otro Usuario? 1=Si 0=No");
        otro=lectura.nextInt();
    }

    System.out.println("Fin Del Programa");
    lectura.close();
    }  
}
