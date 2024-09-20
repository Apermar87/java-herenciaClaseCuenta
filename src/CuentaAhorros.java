public class CuentaAhorros extends CuentaBancaria {
    @SuppressWarnings("unused")
    private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < 10000) {
            activa = false;
        } else {
            activa = true;
        }
    }

    public void consignarCantidad(float consignar) {
        if (activa = true) {
            super.consignarCantidad(consignar);
        }
    }

    public void retirarCantidad(float retirar) {
        if (activa = true) {
            super.retirarCantidad(retirar);
        }
    }

    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        if (saldo < 10000) {
            activa = false;
        }
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual " + comisionMensual);
        System.out.println("Número de transacciones realizadas " + (numeroConsignaciones + numeroRetiros));
        System.out.println("");
    }
}
