package Ej_4_Fibonacci;


import java.util.ArrayList;

public class Ej_4 {

    public ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> aux = new ArrayList<>();

        // Casos base
        if (n == 0) {
            aux.add(0);
            return aux;
        } else if (n == 1) {
            aux.add(0);
            aux.add(1);
            return aux;
        }

        // Inicializar explícitamente los dos primeros números de Fibonacci
        aux.add(0);
        aux.add(1);

        // Calcular iterativamente los números de Fibonacci hasta n
        for (int i = 2; i <= n; i++) {
            int siguienteNumero = aux.get(i - 1) + aux.get(i - 2);
            aux.add(siguienteNumero);
        }
        imprimir(aux);
        return aux;
    }

    public void imprimir (ArrayList<Integer> arr){
        for(int i=0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }

    }

}
