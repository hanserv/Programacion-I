package tarea.pkg1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //2. Realizar un programa que incluya las 4 operaciones matemáticas básicas (Suma, Resta, Multiplicación y División).
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese otro numero: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("La suma de los numeros es: "+ (num1+num2));
        System.out.println("La resta de los numeros es: "+ (num1-num2));
        System.out.println("La multiplicacion de los numeros es: "+ (num1*num2));
        if(num2 == 0) System.out.println("Error. No se puede dividir entre 0");
        else System.out.println("La division de los numeros es: "+ (num1/num2));
    }
}
