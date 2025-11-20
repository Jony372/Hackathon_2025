package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        new Transaccion("Deposito", 2503.23);
        new Transaccion("Retiro", 342.0);
        new Transaccion("Deposito", 4365.1);
        new Transaccion("Retiro", 234.56);

        System.out.println(Transaccion.totalRetiros());

    }
}
