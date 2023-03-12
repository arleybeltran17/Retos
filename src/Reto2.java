import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) throws Exception {
       String Nombmadre="";
       String Nombbebe="";
       String NombDoc="";
       int Pesobebe=0;
       int Dosisvac=0;
       int Anoact=0;
       int Anonaci=0;
       int Mesact=0;
       int Mesnaci=0;
       int Meses=0;
       int Anos=0;



       Scanner Dosis = new Scanner(System.in);

       System.out.println("Ingrese el nombre del Doctor");
       NombDoc=Dosis.nextLine();

       System.out.println("Ingrese el nombre de la Madre");
       Nombmadre=Dosis.nextLine();

       System.out.println("Ingrese el nombre del BeBe");
       Nombbebe=Dosis.nextLine();

       System.out.println("Ingrese Peso del Bebe");
       Pesobebe=Dosis.nextInt();

       System.out.println("Ingrese año Actual(Tipo fecha)");
       Anoact=Dosis.nextInt();

       System.out.println("Ingrese año De Nacimiento del bebe(Tipo fecha)");
       Anonaci=Dosis.nextInt();

       System.out.println("Ingrese mes actual(Tipo fecha)");
       Mesact=Dosis.nextInt();

       System.out.println("Ingrese el mes de nacimiento del BeBe(Tipo fecha)");
       Mesnaci=Dosis.nextInt();

       Anos= Math.abs(Anoact-Anonaci);
       Meses= Math.abs(Mesact-Mesnaci);

       Dosisvac= Math.abs (Pesobebe+10);
       
       Dosisvac= Math.abs (Meses+10);
      
       Dosisvac= Math.abs (Meses+Pesobebe*8);
       

       System.out.println("Nombre del Doctor:"+NombDoc);
       System.out.println("Nombre de la Madre:"+Nombmadre);
       System.out.println("Nombre del Bebe:"+Nombbebe);

       System.out.println("Años del Bebe:"+Anos);
       System.out.println("Meses del Bebe:"+Meses);
       System.out.println("Dosis Requerida:"+Dosisvac+"Ml");

       Dosis.close();



    







       



    }
}


