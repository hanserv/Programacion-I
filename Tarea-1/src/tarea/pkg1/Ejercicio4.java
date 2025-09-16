package tarea.pkg1;

public class Ejercicio4 {
    public static void main(String[] args) {
        //4. Realizar un programa que imprima los números pares del 2 al 100 utilizando ciclos "while".
        int iterador = 1;
        
        while(iterador <= 100) {
            if(iterador % 2 == 0) System.out.println(iterador);
            iterador++;
        }
    }
}
