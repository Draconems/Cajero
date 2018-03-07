package clases;

import java.util.Scanner;

public abstract class Menu {

    protected double transaccion;
    protected double retiro;
    protected double deposito;
    private static double saldo;
    protected int OpcionElejida;

    Scanner entrada = new Scanner(System.in);

    void InicioOpcion() {

        try {

            System.out.println("   Por favor, seleccione una opción.   ");
            ImprimeMenuCajero();
            OpcionElejida = entrada.nextInt();
            EleccionMenu(OpcionElejida);

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

    private void ImprimeMenuCajero() {
        System.out.println("--------------------------------------------");
        System.out.println("    1. Consulta de saldo.");
        System.out.println("    2. Retiro de efectivo.");
        System.out.println("    3. Deposito de efectivo.");
        System.out.println("    4. Salir.");
        System.out.println("--------------------------------------------");
        System.out.print("    : ");
    }

    private void EleccionMenu(int OpcionElejida) {

        switch (OpcionElejida) {

            case 1:
                Menu conexionC = new Consulta();
                conexionC.Transaccion();
                InicioOpcion();
                break;

            case 2:

                Menu conexionR = new Retiro();
                conexionR.Transaccion();
                InicioOpcion();

                break;

            case 3:

                Menu conexionD = new Deposito();
                conexionD.Transaccion();
                InicioOpcion();

                break;

            case 4:

                break;

            default:
                System.out.println("-----------------------------------------");
                System.out.println("Opcion no disponible, vuelva a intentarlo.");
                System.out.println("-----------------------------------------");
                InicioOpcion();
        }

    }

    protected void RetiroCuenta() {
        retiro = entrada.nextDouble();
    }

    protected void DepositoCuenta() {
        deposito = entrada.nextDouble();
    }

    public abstract void Transaccion();

    public double getSaldo() {
        return saldo;

    }

    public void setSaldo(double saldo) {
        //this.saldo=saldo;
        Menu.saldo = saldo;

    }

}
