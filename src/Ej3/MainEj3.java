package Ej3;

import java.util.Scanner;

import static Ej3.Canciones.*;

public class MainEj3 {
    public static void main(String[] args) {
        int[][] canciones = new int[100][2];
        char respuesta;
        Scanner sc= new Scanner(System.in);
        generarCanciones(canciones);
        do{
            elegirCancion(canciones);
            System.out.println("Va a votar otra persona?");
            respuesta= sc.nextLine().charAt(0);
        } while(respuesta == 's');
        mostrarCancionesVotadas(canciones);
    }
}
