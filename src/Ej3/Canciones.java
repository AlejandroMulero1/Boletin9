package Ej3;

import java.util.Scanner;

public class Canciones {
    //Metodo que introduce 100 canciones en el array
    public static void generarCanciones(int[][] listaCanciones) {
        for (int i = 0; i < listaCanciones.length; i++) {
            listaCanciones[i][0] = i + 1;
        }
    }

    public static void elegirCancion(int[][] listaCanciones) {
        int cancionVotada;
        final int CANTIDADVOTOS=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las canciones por la que desea votar");
        for (int i = 0; i < CANTIDADVOTOS; i++) {
            cancionVotada = sc.nextInt();
            //Operacion que pasa el valor introducido a su equivalente en el array, es decir, una posición anterior
            cancionVotada=cancionVotada-1;
            listaCanciones[cancionVotada][1] = listaCanciones[cancionVotada][1] + 1;
        }

    }

    //Metodo que muestra la canciones que han sido votadas
    public static void mostrarCancionesVotadas(int[][] listaCanciones) {
        ordenarTabla(listaCanciones);
        ocultarCancionesNoVotadas(listaCanciones);
    }

    //Metodo que oculta las canciones no votadas a traves del valor en la posicion [i][1] (la segunda columna)
    private static void ocultarCancionesNoVotadas(int[][] listaCanciones){
        System.out.println("Canciones:  Votos:");
        for (int i = 0; i < listaCanciones.length; i++) {
            for (int j = 0; j < listaCanciones[0].length; j++) {
                if (listaCanciones[i][1] > 0) {
                    System.out.print(listaCanciones[i][j] + "\t \t \t");
                }
            }
            //if para separar el println del print para no anular este ultimo
            if (listaCanciones[i][1] > 0) {
                System.out.println();
            }
        }
    }

    private static void ordenarTabla(int[][] tablaCanciones) {
        int numAux, numAux2;
        for (int i = 0; i < tablaCanciones.length; i++) {
            for (int j = i; j < tablaCanciones.length; j++) {
                if (tablaCanciones[i][1] < tablaCanciones[j][1]) {
                    numAux = tablaCanciones[i][1];
                    tablaCanciones[i][1] = tablaCanciones[j][1];
                    tablaCanciones[j][1] = numAux;
                    numAux2 = tablaCanciones[i][0];
                    tablaCanciones[i][0] = tablaCanciones[j][0];
                    tablaCanciones[j][0] = numAux2;
                }
            }
        }
    }
    }



