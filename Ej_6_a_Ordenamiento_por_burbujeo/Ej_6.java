package Ej_6_a_Ordenamiento_por_burbujeo;

public class Ej_6 {

    public void ordenarPorBurbujeo(int[] arreglo) {
        boolean intercambiado = true;

        while (intercambiado) {
            intercambiado = false;

            for (int i = 0; i < arreglo.length - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    // Intercambiar elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;

                    intercambiado = true;
                }
            }
        }
    }
}