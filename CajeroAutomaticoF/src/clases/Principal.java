/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Principal {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("-----------------Bienvenido-----------------");
        System.out.println("--------------------------------------------");
        System.out.println();
        Menu mensajero = new Consulta();
        mensajero.setSaldo(1500);
        mensajero.InicioOpcion();

    }

}
