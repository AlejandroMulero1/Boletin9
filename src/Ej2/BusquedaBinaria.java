package Ej2;

public class BusquedaBinaria {
    public static boolean busquedaBinaria(int [] array, int dato){
        int inicio=0;
        int fin =array.length-1;
        int mitad=(inicio+fin)/2;
        boolean encontrado=false;

        while(inicio<=fin && encontrado==false){
            if(array[mitad] == dato){
                encontrado=true;
            }else {
                if(array[mitad]>dato){
                    fin=mitad-1;
                }else {
                    inicio=mitad+1;
                }
                mitad=(inicio+fin)/2;
            }
        }
        return encontrado;


    }
}
