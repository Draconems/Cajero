package clases;

public class Consulta extends Menu {

    @Override
    public void Transaccion() {

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("-----------------------------------------");
        System.out.println();

    }

}
