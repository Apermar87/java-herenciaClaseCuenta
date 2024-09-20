public class CuentaCorriente extends CuentaBancaria {
    private float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro = 0;
    }

    public void retirarCantidad(float retirar) {
        float resultado = saldo - retirar;
        if (resultado < 0) {
            sobregiro -= resultado;
            saldo = 0;
            numeroRetiros = numeroRetiros + 1;
        } else {
            super.retirarCantidad(retirar);
        }
    }

    public void consignarCantidad(float consignar) {
        float residuo = sobregiro - consignar;
        if (sobregiro > 0) {
            if (residuo > 0) {
                sobregiro = 0;
                saldo = residuo;
            } else {
                sobregiro = -residuo;
                saldo = 0;
            }
        } else {
            super.consignarCantidad(consignar);
        }
    }

    public void extractoMensual() {
        super.extractoMensual();
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual " + comisionMensual);
        System.out.println("Número de transacciones realizadas " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Valor de sobregiro: " + sobregiro);
    }
}
