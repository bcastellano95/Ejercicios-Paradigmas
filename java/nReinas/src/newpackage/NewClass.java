package newpackage;



import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
public class main {

    public static int tamaño = 0;
    public static int tablero[][];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("tamaño del tablero");
        tamaño = n = sc.nextInt();
        tablero = new int[tamaño][tamaño];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }

        System.out.println("Fila inicial");
        int fila = sc.nextInt();
//        tablero = llenartablero(tablero);
        nReinasBackTrack(fila - 1, n);
    }

//    public static int[][] llenartablero(int[][] tabler) {
//        for (int i = 1; i <= tabler.length; i++) {
//            for (int j = 1; j <= tabler[i].length; j++) {
//                tabler[i][j] = 0;
//            }
//        }
//        return tabler;
//    }
    public static void nReinasBackTrack(int fila, int n) {

        for (int i = 0; i < n; i++) {
            if (seguro(fila, i)) {
                System.out.print(seguro(fila, i));
                tablero[fila][i] = 1;
                System.out.println(fila);
                if (fila == n) {
                    //imprimir(tablero);
                } else {
                    nReinasBackTrack(fila + 1, n);
                }
            }
        }
    }

    public static boolean seguro(int fila, int columna) {
        boolean aux = true;
        for (int i = 0; i <= tablero.length; i++) {
            if (tablero[i][columna] == 1) {
                aux = false;
                System.out.println(tablero[i][columna]);

            }

        }
//        for (int i = 0; i < tablero.length; i++) {
//            if (tablero[fila][i] == 1) {
//                System.out.print(tablero[fila][i]);
//
//                aux = false;
//            }
//        }
//        int reinicio = Math.min(fila, columna);
//        // System.out.println(reinicio);
//        for (int i =  (fila - reinicio)-1, j = columna - reinicio; i < tamaño && j < tamaño; i++, j++) {
//            // System.out.println(i + " " + j);
//            if (tablero[i][j] == 1) {
//                return false;
//            }
//        }
//        for (int i = fila - reinicio, j = (columna + reinicio)-1; i < tamaño && j > 0; i++, j--) {
//            
//            if (tablero[i][j] == 1) {
//                return false;
//            }
//        }
        return aux;
    }

    

}
