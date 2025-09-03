package Practicas;
import java.util.Scanner;
public class Ejercicio6 {
public static void main(String[] args) {
		Scanner datos=new Scanner(System.in);
		double edad; 
		System.out.println("Ingrese la edad en años : (Puede usar decimales, ej: 0.2 para dos meses): "); 
		edad=datos.nextDouble();
		System.out.println("Ingrese su sexo; M para masculino y F para femenino.");
		char sexo=datos.next().toUpperCase().charAt(0);
		System.out.println("Ingrese el valor de hemoglobina (hg)");
	        double hg=datos.nextDouble();
		double rangoMin=0,rangoMax=0; 
		boolean RangoEncontrado=true; 
		if (edad>=0 && edad<=0.1){
			rangoMin=13;
			rangoMax=26;
		}
                else if (edad>0.1 && edad<=0.6 ){
			rangoMin=10;
			rangoMax=18;
		}
                else if (edad>0.6 && edad<=1){
			rangoMin=11;
			rangoMax=15;
		}
                else if (edad>1 && edad<=5){
                    rangoMin=11.5;
                    rangoMax=15;                    
                }
                else if (edad>5 && edad<=10){
                    rangoMin=12.6;
                    rangoMax=15.5;      
		}
                else if (edad>10 && edad<=15){
                    rangoMin=13;
                    rangoMax=15.5;
                }
                else if (edad>15 && sexo == 'M'){
                    rangoMin=12;
                    rangoMax=16;
                }
                else if (edad>15 && sexo == 'F'){
                    rangoMin=14;
                    rangoMax=18;
                }
                else {
                    RangoEncontrado=false;
                }
                //resultado 
                if (RangoEncontrado){
                    if (hg<rangoMin){
                        System.out.println("POSITIVO PARA ANEMIA");
                    }
                    else {
                        System.out.println("NEGATIVO PARA ANEMIA");    
                    }                       
                }
                else {
                    System.out.println("NO SE ECONTRO RANGO VALIDO");
                }		
	}	
	}

