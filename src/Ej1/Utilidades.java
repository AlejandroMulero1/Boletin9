package Ej1;

public class Utilidades {
    public static void metodoBurbuja(int [] array){
        //Declaración de variables
        int auxiliar;
        //Inicio del proceso
        for(int i=0; i< array.length; i++){
            for(int j=i; j<array.length; j++) {
                if (array[i] > array[j]) {
                    auxiliar = array[i];
                    array[i] = array[j];
                    array[j] = auxiliar;
                }
            }
        }
        for(int x:array){
            System.out.println(x);
        }
    }

    public static void seleccionDirecta(int [] array) {
        int MINIMO, i, aux;
        for (i = 0; i < array.length; i++) {
            MINIMO = i;
            for (int j = i; j < array.length; j++) {
                if (array[MINIMO] > array[j]) {
                    MINIMO = j;
                }
            }

        //intercambio para poner en su lugar el más grande
         aux = array[i];
        array[i] = array[MINIMO];
        array[MINIMO] = aux;
    }
        for(int x:array){
            System.out.println(x);
        }
    }

    public static int[] quicksort(int A[], int izq, int der) {

        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i < j){                          // mientras no se crucen las búsquedas
            while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while(A[j] > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado
                aux= A[i];                      // los intercambia
                A[i]=A[j];
                A[j]=aux;
            }
        }

        A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos
        A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

        if(izq < j-1)
            quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
            quicksort(A,j+1,der);          // ordenamos subarray derecho

        return A;
    }

    public static void busquedaSecuencial(int [] array){
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int insertOrden(int[] miarray, int dato, int posVal) {
        int nuevaLong = -1; //fracaso
        int indice = 0;
        if (dato > miarray[posVal]) {//lo inserto al final
            miarray[posVal+1] = dato;
        } else {
            if (dato < miarray[0]) {//lo inserto al principio y desplazo todo una posición al final
                for (int i = posVal; i >= 0; i--) {
                    miarray[i+1] = miarray[i];
                }
                miarray[0] = dato;
            } else { //busco el sitio
                while (miarray[indice] <= dato) {
                    indice++;
                }//hago hueco
                for (int i = posVal; i >= indice; i--) {
                    miarray[i+1] = miarray[i];
                }
                miarray[indice] = dato;
            }
        }

        return ( posVal+1 );
    }
}
