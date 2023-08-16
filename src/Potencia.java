/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aleja
 */
  import java.util.Scanner;
public class Potencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();
        
        double resultado = calcularPotencia(base, exponente);
        
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
        
        scanner.close();
    }
    
    public static double calcularPotencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente > 0) {
            return base * calcularPotencia(base, exponente - 1);
        } else {
            return 1 / calcularPotencia(base, -exponente);
        }
    }
}


