import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");

        System.out.println("Ingrese saldo inicial= ");
        float saldoInicial = input.nextFloat();

        System.out.println("Ingrese tasa de interés= ");
        float tasaInteres = input.nextFloat();

        CuentaAhorros c1 = new CuentaAhorros(saldoInicial, tasaInteres);

        System.out.println("Ingrese cantidad a consignar= ");
        float consignar = input.nextFloat();
        c1.consignarCantidad(consignar);

        System.out.println("Ingrese cantidad a retirar= ");
        float retirar = input.nextFloat();
        c1.retirarCantidad(retirar);
        c1.extractoMensual();
        c1.imprimir();

        System.out.println("Cuenta Corriente");

        System.out.println("Ingrese saldo inicial= ");
        float saldoInicialCuentaCorriente = input.nextFloat();

        System.out.println("Ingrese tasa de interés= ");
        float tasaInteresCuentaCorriente = input.nextFloat();

        CuentaCorriente c2 = new CuentaCorriente(saldoInicialCuentaCorriente, tasaInteresCuentaCorriente);

        System.out.println("Ingrese cantidad a consignar= ");
        float consignarCuentaCorriente = input.nextFloat();
        c2.consignarCantidad(consignarCuentaCorriente);

        System.out.println("Ingrese cantidad a retirar= ");
        float retirarCuentaCorriente = input.nextFloat();
        c2.retirarCantidad(retirarCuentaCorriente);

        c2.extractoMensual();
        c2.imprimir();

    }
}
