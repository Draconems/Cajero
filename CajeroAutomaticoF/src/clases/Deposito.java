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
public class Deposito extends Menu {

    @Override
    public void Transaccion() {

        try {

            System.out.println("Cuanto deseas depositar: ");
            DepositoCuenta();

            transaccion = getSaldo();
            setSaldo(transaccion + deposito);
            System.out.println();
            System.out.println("-----------------------------------------");
            System.out.println("Depositaste: " + deposito);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("-----------------------------------------");
            System.out.println();
        } catch (Exception e) {
            System.out.println();
            System.out.println("********************************************");
            System.out.println("Los datos son incorrectos.");
            System.out.println("Intentelo nuevamente.");
            System.out.println("********************************************");
            System.out.println();
            entrada.nextLine();
            InicioOpcion();

        }

    }

}
