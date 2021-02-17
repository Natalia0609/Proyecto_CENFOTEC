package ejercicios;
import java.io.*;
import java.util.Scanner; 




public class Cosevi {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    
    public static void main(String[] args) throws IOException {
        Scanner teclado= new Scanner(System.in);
        int puntos_acumulados ;
        int Monto;
        int Vigencia;
        int True_BCR;

        System.out.println("*Requisitos NECESARIOS para la renovacion de la licencia*:");
        System.out.println("1: Documento de identidad al día y en buen estado");
        System.out.println("2: Tener vigente el dictamen medico digital");
        System.out.println("3: Pagar todas las multas pendientes y no haber acumulado 12 puntos por infracciones de tránsito");
        System.out.println("                                                                                                ");
        System.out.println("                                                                                                ");

        System.out.println(" *Informacion importante* ");
        System.out.println("Para los que tienen 12 o mas puntos acumulados por infracciones de tránsito, SE LE SUSPENDE LA LICENCIA Y NO PUEDE RENOVARLA");
        System.out.println("                                                                                                                             ");

        System.out.println("Digite cuantos puntos tiene acumulados por infracciones en su licencia");
        puntos_acumulados= Integer.parseInt(in.readLine());
       
        
        if (puntos_acumulados >= 12) {
            System.out.println("Tiene la licencia suspendida");
            System.out.println("No puede renovarla");
            
        } else {
            System.out.println("No tiene la licencia suspendida");
            System.out.println("Puede renovarla");
            
        }

        if (puntos_acumulados == 4 ) {
        System.out.println("Monto = 5000");
        System.out.println("Vigencia es igual a 6 años");
     
        }

        if (puntos_acumulados == 5) {
        System.out.println("Monto = 10000");
        System.out.println("Vigencia es igual a 4 años");
        
        }

        if (puntos_acumulados == 8) {
        System.out.println("Monto = 10000");
        System.out.println("Vigencia es igual a 4 años");
        
        }

        if (puntos_acumulados == 9) {
        System.out.println("Monto = 10000");
        System.out.println("Vigencia es igual a 3 años");
        
        }

        if (puntos_acumulados == 11) {
        System.out.println("Monto = 10000");
        System.out.println("Vigencia es igual a 3 años");
        
        }
        
         if ( puntos_acumulados<=11) { 
             System.out.println("¿Si desea pagar con el BCR, escriba el numero 1?");
            True_BCR = Integer.parseInt(in.readLine());

             if (True_BCR==1) { System.out.println("Si renueva su licencia en el BCR, esto tendrá un costo adicional de 4200, por el servicio prestado");
             
                 
             }
             else {
                System.out.println("Puede proceder con su pago sin ningun costo adicional");
                
            }
            
         } 
         

        

        
      
        



    }

    


    

}
