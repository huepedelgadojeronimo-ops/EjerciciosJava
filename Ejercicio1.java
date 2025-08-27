package practicas;
import java.util.Scanner;
/* author JeronimoHuepeDelgado-20251233101
*/
public class Ejercicio1 {
 public static void main(String[] args) {
int NumDispositivos;    
double descuento, Total,SubTotal; 
int precio= 500;
//Precio sin descuentos 
Scanner Num = new Scanner (System.in);
     System.out.println("Ingrese el numero de computadoras que quiere comprar: ");
    NumDispositivos = Num.nextInt();
    SubTotal= precio*NumDispositivos;
 if (NumDispositivos<=5){
     descuento= SubTotal*0.1;
     Total= SubTotal-descuento;
     System.out.println("El total de su compra es: "+Total );
 }  
 else if (NumDispositivos>=5 && NumDispositivos<10){
     descuento= SubTotal*0.2;
     Total=SubTotal-descuento;
     System.out.println("El total de su compra es: "+ Total);
 }
 else {
     descuento= SubTotal*0.4;
     Total=SubTotal-descuento;
     System.out.println("El total de su compra es: "+ Total);  
     
 }
 System.out.println("Gracias por su compra, Vuelva pronto (:");
}
 }
