package tarea.pkg1;

public class Ejercicio5 {
    public static void main(String[] args) {
        //5. Realizar un programa que imprima la sumatoria de los números del 1 al 50 utilizando ciclos "do while".
        int iterador = 1;
        int resultado = 0;
        do {
            resultado += iterador;
            iterador++;
        } while (iterador <= 50);
        
        System.out.println("El resultado de la suma de los numeros del 1 al 50 es: "+ resultado);
    }
}
