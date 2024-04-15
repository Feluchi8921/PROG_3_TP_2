package Ej_1_Verificar_arreglo_ordenado;

public class Ej_1 {
    public boolean isOrdenado(int[] arr, int i) {
        if (i < arr.length-1) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
            else{
                return isOrdenado(arr, i+1);
            }
        }
        else{
            return true;
        }
    }

    public void imprimir(int[]arr, int i){
        System.out.println("El arreglo está ordenado: "+isOrdenado(arr,i));
    }

}
