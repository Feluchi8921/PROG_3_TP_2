package Ej_5_Elemento_igual_a_posicion;

public class Main {
    public static void main(String []args){
        Ej_5 elemento = new Ej_5();
        int[] arr = {-3, 0, 1, 3, 5, 7, 9};
       System.out.println(elemento.VerificarElementoIgualPosicion(arr, 0, arr.length-1));
    }
}
