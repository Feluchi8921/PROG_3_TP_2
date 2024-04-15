package Ej_5_Elemento_igual_a_posicion;

public class Ej_5 {

    public boolean VerificarElementoIgualPosicion(int[] arr, int inicio, int fin) {

        if(inicio >fin){
            return false;
        }

        int medio = (inicio + fin) / 2;

        if(arr[medio]==medio){
            return true;
        }

        else if(arr[medio] <medio) {
            return VerificarElementoIgualPosicion(arr, inicio, medio - 1);
        }

        else {
            return VerificarElementoIgualPosicion(arr, medio + 1, fin);
        }
    }
}
