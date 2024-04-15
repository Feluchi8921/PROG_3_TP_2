package Ej_6_a_Ordenamiento_por_seleccion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arreglo = {5, 2, 4, 1, 3};
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));

        Ej_6 ordenamiento = new Ej_6();
        ordenamiento.ordenarPorSeleccion(arreglo);

        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }
}
