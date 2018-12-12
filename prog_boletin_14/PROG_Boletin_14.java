package prog_boletin_14;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class PROG_Boletin_14 {

    public static void main(String[] args) {
        
        ConversorTemperaturas c1 = new ConversorTemperaturas();
       
        System.out.println("Introduce la temperatura en centigrados a convertir");
        Scanner scan = new Scanner(System.in);
        float temp = scan.nextFloat();
        
        try{ System.out.println("temperatura en Fharenheit: " + c1.centigradosAFharenheit(temp));
        }catch (TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());   
        }
        
        try{ System.out.println("temperatura en Reamur: " + c1.centigradosAReamur(temp));
        }catch (TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());   
        }
       
    }
    
}
