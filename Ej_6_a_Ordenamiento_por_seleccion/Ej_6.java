package Ej_6_a_Ordenamiento_por_seleccion;

public class Ej_6 {


    public void ordenarPorSeleccion(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Intercambiar el elemento mínimo con el elemento en la posición actual
            int temp = arreglo[i];
            arreglo[i] = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = temp;
        }
    }
}