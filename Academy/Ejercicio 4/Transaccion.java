package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class Transaccion {
    private String tipo;
    private BigDecimal monto;
    private Date fecha;

    private static BigDecimal totalDepositos = BigDecimal.ZERO;
    private static BigDecimal totalRetiros = BigDecimal.ZERO;

    public Transaccion(String tipo, Double monto) {
        this.tipo = tipo;
        this.monto = new BigDecimal(monto).setScale(2, BigDecimal.ROUND_HALF_UP);
        this.fecha = new Date(System.currentTimeMillis());

        if(tipo.compareToIgnoreCase("Deposito") == 0){
            totalDepositos = totalDepositos.add(BigDecimal.valueOf(monto).setScale(2, BigDecimal.ROUND_HALF_UP));
        }else{
            totalRetiros = totalRetiros.add(BigDecimal.valueOf(monto).setScale(2, BigDecimal.ROUND_HALF_UP));
        }
    }

    public static BigDecimal totalDepositos() {
        return totalDepositos;
    }

    public static BigDecimal totalRetiros() {
        return totalRetiros;
    }
}
