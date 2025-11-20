package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cliente {
    private String id;
    private String nombre;
    private BigDecimal saldo;
    private ArrayList<Transaccion> transacciones = new ArrayList<>();

    public Cliente(String id, String nombre, Double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = new BigDecimal(saldo).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public String depositar(Double monto){
        if (monto>0){
            Transaccion t = new Transaccion("Deposito", monto);
            transacciones.add(t);
            this.saldo = this.saldo.add(BigDecimal.valueOf(monto).setScale(2, BigDecimal.ROUND_HALF_UP));
            return "Deposito realizado";
        }else{
            return "No se puede realizar el deposito";
        }
    }

    public String retirar(Double monto){
        if (monto <= this.saldo.doubleValue()){
            Transaccion t = new Transaccion("Retiro", monto);
            transacciones.add(t);
            this.saldo = this.saldo.subtract(BigDecimal.valueOf(monto).setScale(2, BigDecimal.ROUND_HALF_UP));
            return "Retiro realizado";
        }else {
            return "No se puede retirar esa cantidad";
        }
    }
}
