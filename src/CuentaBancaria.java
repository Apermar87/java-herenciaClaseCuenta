public class CuentaBancaria {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public CuentaBancaria(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignarCantidad(float consignar) {
        saldo = consignar + saldo;
        numeroConsignaciones = numeroConsignaciones + 1;
    }

    public void retirarCantidad(float retirar) {
        if (retirar <= saldo) {
            saldo -= retirar;
            numeroRetiros = numeroRetiros + 1;
        } else {
            System.out.println("La cantidad a retirar no puede ser mayor al saldo");
        }
    }

    public void calcularInteresMensual() {
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteresMensual();
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de consignaciones " + numeroConsignaciones);
        System.out.println("Número de retiros " + numeroRetiros);
        System.out.println("Tasa anual " + tasaAnual);
        System.out.println("Comisión mensual " + comisionMensual);
    }
}
