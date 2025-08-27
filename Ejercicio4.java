package practicas;
import java.util.Scanner;
/**
 * @author JeronimHuepeDelgado-20251233101
 */
public class Ejercicio4 {
    public static void main(String[] args) {
    final int KiloManzana= 9500;
    double PesoKilos, Descuento, Total, FinalTotal;
    Scanner Manzanas=new Scanner(System.in);
    //Kilos  a comprar 
        System.out.println("El Kilo de manzanas esta en: "+ KiloManzana+"Kg");
        System.out.println("Ingrese el peso en Kilos(Kg) de manzanas a comprar : ");
        PesoKilos=Manzanas.nextDouble();//OJO CON LA DEFINICION DEL SCANNER QUE ME ESTOY CONFUNCIENDO MUCHO
        Manzanas.nextLine();
    //Total sin descuento    
        Total=PesoKilos*KiloManzana;
    //Descuento    
    if (PesoKilos>=0 && PesoKilos<=2){  
        Descuento=0;  
    } 
    
    else if (PesoKilos>=2.01 && PesoKilos<=5){
        Descuento=0.1*Total;
    }
    else if (PesoKilos>=5.01 && PesoKilos<=10){
        Descuento=0.15*Total;
    }
    else {
        Descuento=0.2*Total;
    }
    FinalTotal=Total-Descuento;
        System.out.println("El precio final de kilos de manzanas es: ");
        System.out.println(FinalTotal);
        
                
        
        
        
        
        
    
    
        
    
}
}