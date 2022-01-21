/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import org.apache.commons.lang3.RandomUtils;

/**
 *
 * @author reroes
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 100;
        int b = 110;
        obtenerDatos(a, b);

    }

    public static void obtenerDatos(int a, int b) {
        int[] c = new int[10];
        for (int i = 0; i < c.length; i++) {
            c[i] = RandomUtils.nextInt(a, b);

        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
