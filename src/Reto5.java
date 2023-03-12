import java.util.Random;
import java.util.Scanner;

public class Reto5 {
    //Caja Registradora
    public static void main(String[] args) throws Exception {
    int numeroemp,numreg,numerovent,edad,regisemp, total,metodopag; 
    double numtran;   
    String nombreemp;

    Scanner lectura = new Scanner(System.in);

    for(int i=1; i<=10;i++){
        System.out.println(i+"");

    System.out.println("Se Encuentra Registradro?, 1=Si, 2=No");
    regisemp=lectura.nextInt();

    switch(regisemp){
        case 1:{
            System.out.println("Estas Registrado, Bienvenido Al Sistema");
        }
        break;

        case 2:{
            System.out.println("Por Favor llenar La Siguiente Informacion");

            Random generator=new Random();
            int numeroempregis= generator.nextInt(1000000000);

            System.out.println("Ingrese Su Nombre Completo");
            nombreemp=lectura.nextLine();

            System.out.println("Ingrese Su Edad");
            edad=lectura.nextInt();

            System.out.println("Su Nombre Es: "+nombreemp);
            System.out.println("Su Edad Es: "+edad);
            System.out.println("El Numero Que Se Le Asigno Es: "+numeroempregis);
        }
        break;

        default:{
            System.out.println("Opcion No Existente Por Favor Volver a Intentar");
        }

    }
            System.out.println("Numero De Registro");
            numreg=lectura.nextInt();

            System.out.println("Ingrese El Numero De Venta");
            numerovent=lectura.nextInt();

            System.out.println("Ingrese Su Codigo De Empleado");
            numeroemp=lectura.nextInt();

            System.out.println("Ingrese Su Nombre");
            nombreemp=lectura.nextLine();

            System.out.println("Ingrese El Total De La Compra");
            total=lectura.nextInt();

            System.out.println("Ingrese Metodo De Pago, 1=Efectivo, 2=Pago Tarjeta, 3= Pago Por Aplicacion");
            metodopag=lectura.nextInt();
            

            System.out.println("El Numero De Registro Es: "+numreg);
            System.out.println("El Numero De Venta Es: "+numerovent);
            System.out.println("El Numero De Empleado Es: "+numeroemp);
            System.out.println("EL Nombre Del Empleado Es: "+nombreemp);
            System.out.println("El Total De La Compra Es: "+total);

            switch(metodopag){
                case 1:{
                    System.out.println("Eligio Efectivo");
                    System.out.println("Total De Compra Es: "+total);
                }
                break;

                case 2:{
                    System.out.println("Eligio Pago Por Tarjeta");
                    System.out.println("El Total De La Compra Es: "+total);
                }
                break;

                case 3:{
                    System.out.println("Eligio Pago Por Aplicacion");
                    System.out.println("Ingrese El Numero Al Cual Se Realizara La Transaccion");
                    numtran=lectura.nextDouble();

                    System.out.println("El Numero Al Cual Se Hara La Transaccion Es: "+numtran);

                    }
                }
                }

                lectura.close();
     }
   }



 


    

