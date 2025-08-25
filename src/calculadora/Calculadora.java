package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
         Scanner calculator = new Scanner(System.in);

        // Variables 
        int opcion;
        double num1, num2;
        double resultado;

        // Menú
       System.out.println("**CALCULADORA** ");
       
       System.out.println("1.SUMA");
       
       System.out.println("2.RESTA");
       
       System.out.println("3.MULTIPLICACION");
       
       System.out.println("4.DIVISION");
       
       System.out.println("5.RAIZ CUADRADA");
        
       System.out.println("Elige una opcion: ");

        //Leer opción
       opcion = calculator.nextInt();

        // 3. Switch para cada operación
        switch (opcion) {
            case 1 -> {
                // Código de suma
                System.out.println("Ingrese el primer numero: ");
                num1 = calculator.nextDouble();
                
                System.out.println("Ingrese el segundo numero: ");
                num2 = calculator.nextDouble();
                
                resultado = num1 + num2;
                
                System.out.print("El resultado de la suma es: " + resultado);
            }
            case 2 -> {
                // Código de resta
                System.out.println("Ingrese el primer numero: ");
                num1 = calculator.nextDouble();
                
                System.out.println("Ingrese el segundo numero: ");
                num2 = calculator.nextDouble();
                
                resultado = num1 - num2;
                
                System.out.print("El resultado de la resta es: " + resultado);
            }
                
            case 3 -> {
                // Código de multiplicación
                System.out.println("Ingrese el primer numero: ");
                num1 = calculator.nextDouble();
                
                System.out.println("Ingrese el segundo numero: ");
                num2 = calculator.nextDouble();
                
                resultado = num1 * num2;
                
                System.out.println("El resultado de la multiplicacion es: " + resultado);
            }
                
            case 4 -> {
                // Código de división
                System.out.println("Ingrese el primer numero: ");
                num1 = calculator.nextDouble();
                
                System.out.println("Ingrese el segundo numero: ");
                num2 = calculator.nextDouble();
                
                if (num2 !=0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la division es: " + resultado);
                }  
                else {System.out.println("No se puede dividir entre cero ");
                }
            }
                
            case 5 -> {
                // Código de raíz cuadrada
                System.out.println("Ingresa un numero positivo: ");
                num1 = calculator.nextDouble();
                if (num1>=0){
                    resultado = Math.sqrt(num1);
                    System.out.println("La raiz cuadrada del numero ingresado es: " + resultado);
                }
                else {
                    System.out.println("Error, no se puede calcular una raiz cuadrada con un numero negativo");
                 
                }
            }
            default -> // Opción inválida
                System.out.println("Opcion invalida, intenta de nuevo");
                
        }
        calculator.close();
    }
}
    