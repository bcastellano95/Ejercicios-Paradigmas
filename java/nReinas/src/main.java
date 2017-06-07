
import java.util.Arrays;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tablero = new int[4];
        reinas(0, tablero);
    }

    public static boolean validar(int col, int pos, int[] tablero) {
        for (int i = 0; i < pos; i++) {
            if (tablero[i] == col) {
                return false;
            }
            if (Math.abs(tablero[i] - col) == Math.abs(i - pos)) {
                return false;
            }
        }
        return true;
    }

    public static void reina1(int pos, int[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            if (validar(i, pos, tablero)) {
                tablero[pos] = i;
                reinas(pos + 1, tablero);
                if (pos == tablero.length) {
                    System.out.println(Arrays.toString(tablero));
                    break;
                }
            } else {
                reina1(pos + 1, tablero);

            }
        }
    }

    public static void reinas(int pos, int[] tablero) {
        if (pos == tablero.length) {
            System.out.println(Arrays.toString(tablero));
            System.exit(0);
        } else {
            for (int i = 0; i < tablero.length; i++) {
                if (validar(i, pos, tablero)) {
                    tablero[pos] = i;
                    reinas(pos + 1, tablero);

                }
            }
        }
    }

}
