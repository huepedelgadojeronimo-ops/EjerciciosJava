package practicas;
import java.util.Scanner;
/**
 * @author JeronimoHuepeDelgado-20251233101
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String marca;
        double Precio, PrecioTotal,DescuentoFinal;
        double descuento= 0;
        final double IVA= 0.19;
        
        Scanner precio = new Scanner (System.in);
        System.out.print("Ingres el precio del aparato: ");
        Precio= precio.nextDouble();
        precio.nextLine(); 
        System.out.print("De que marca es el producto: ");
        marca= precio.nextLine();
        //Descuento precio
        if (Precio>=500){
            descuento= 0.1;
        }
        else {
         
        //Descuento marca  
        }
        if (marca.equals("NOSY")){
            descuento= descuento+0.05;   
        }
        else {
          
        }
        DescuentoFinal=Precio*descuento;
        PrecioTotal=Precio-DescuentoFinal;
        PrecioTotal= PrecioTotal*(1+IVA);
        System.out.println(PrecioTotal);
    
        
        
        
        
        
        
        
        
        
        
        
}
}
