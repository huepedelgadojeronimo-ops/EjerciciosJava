package practicas;
import java.util.Scanner;
/**
@author JeronimHuepeDelgado-20251233101
**/
public class Ejercicio2 {
 public static void main(String[] args) {
 int NumLlantas,PrecioLlantas, Total;
 Scanner Llantas = new Scanner(System.in);
 
     System.out.println("Ingrese el numero de llantas que desea comprar: ");
     NumLlantas = Llantas.nextInt();
     
     if (NumLlantas<5){
        PrecioLlantas=100;
        }
     else if (NumLlantas>=5 && NumLlantas<=10){
        PrecioLlantas= 75;   
        }
     else {
        PrecioLlantas=50;
     }
     Total= NumLlantas*PrecioLlantas;
     System.out.println("El precio de cada llanta es de: "+PrecioLlantas+ " Y el precio total de su compra es: "+ Total);
     
    
}
}