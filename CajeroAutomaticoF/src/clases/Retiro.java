/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author lr_29
 */
public class Retiro extends Menu {

    @Override
    public void Transaccion() {

        try {

            System.out.println("Cuanto deseas retirar: ");
            RetiroCuenta();
            if (retiro <= getSaldo()) {
                transaccion = getSaldo();
                setSaldo(transaccion - retiro);
                System.out.println();
                System.out.println("-----------------------------------------");
                System.out.println("Retiraste: " + retiro);
                System.out.println("Tu saldo actual es: " + getSaldo());
                System.out.println("-----------------------------------------");
                System.out.println();
            } else {

                System.out.println();
                System.out.println("-----------------------------------------");
                System.out.println("Saldo insuficiente.");
                System.out.println("-----------------------------------------");
                System.out.println();

                Transaccion();
            }

        } catch (Exception e) {

            System.out.println("********************************************");
            System.out.println("Los datos son incorrectos.");
            System.out.println("Intentelo nuevamente.");
            System.out.println("********************************************");
            entrada.nextLine();
            InicioOpcion();

        }

    }

}
