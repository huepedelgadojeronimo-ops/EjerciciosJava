package practicas;
import java.util.Scanner;
/**
 * @author Jeronimo
 */
public class Ejercicio5 {
     public static void main(String[] args) {
         double capital, CapitalFinal;
         double prestamo, restante;
         double EquipoComputo=5000, mobiliario=2000;
         Scanner var = new Scanner (System.in);
         System.out.println("Ingrese el capital actual U$: ");
         capital = var.nextDouble();
         // Calcular prestamo y capital final
         if (capital<=0){
             prestamo= 10000-capital;
             CapitalFinal=capital+prestamo;
             System.out.println("Tenia un capital de: U$ "+capital);
             System.out.println("Se solicita un prestamo al banco de: U$"+prestamo);
             System.out.println("Nuevo capital de: U$"+CapitalFinal);
             restante=(CapitalFinal-(EquipoComputo+mobiliario));
             double insumos = restante/2;
             double insentivos= restante/2;
             System.out.println("Se destinan: U$ "+ EquipoComputo+" y U$ " +mobiliario+ " a el equipo de computo y mobiliarios");
             System.out.println("Se destinam: U$ "+ insumos+" para insumos; y se destinan: U$ "+insentivos+" para insentivos.");
             
         }
         else if (capital<=20000){
             prestamo=20000-capital;
             CapitalFinal=capital+prestamo;  
             System.out.println("Tenia un capital de: U$ "+capital);
             System.out.println("Se solicita un prestamo al banco de: U$"+prestamo);
             System.out.println("Nuevo capital de: U$"+CapitalFinal);
             restante=(CapitalFinal-(EquipoComputo+mobiliario));
             double insumos = restante/2;
             double insentivos= restante/2;
             System.out.println("Se destinan: U$ "+ EquipoComputo+" y U$ " +mobiliario+ " a el equipo de computo y mobiliarios");
             System.out.println("Se destinam: U$ "+ insumos+" para insumos; y se destinan: U$ "+insentivos+" para incentivos.");
         }
         else {
             CapitalFinal=capital;
             System.out.println("Tiene un capital de: U$ "+capital);
             restante=(CapitalFinal-(EquipoComputo+mobiliario));
             double insumos = restante/2;
             double insentivos= restante/2;
             System.out.println("Se destinan: U$ "+ EquipoComputo+" y U$ " +mobiliario+ " a el equipo de computo y mobiliarios");
             System.out.println("Se destinam: U$ "+ insumos+" para insumos; y se destinan: U$ "+insentivos+" para insentivos.");;
            
         }
         //Calcualar distribucion 
         
         
         
     }   
}
