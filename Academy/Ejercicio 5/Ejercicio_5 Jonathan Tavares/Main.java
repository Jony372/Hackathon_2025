package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Boolean in = true;

            Cliente c = new Cliente("01", "Usuario", 5000.00);
            Scanner sc = new Scanner(System.in);
            do {
                try {
                    System.out.println("Que desea realizar?"
                            +"\n1) Consultar Saldo"
                            +"\n2) Depositar Saldo"
                            +"\n3) Retirar Saldo"
                            +"\n4) Salir");
                    int opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Saldo: "+c.getSaldo());
                            break;
                        case 2:
                            System.out.println("Monto a depositar");
                            Double monto = sc.nextDouble();
                            System.out.println(c.depositar(monto));
                            break;
                        case 3:
                            System.out.println("Monto a retirar");
                            Double montoRetiro = sc.nextDouble();
                            System.out.println(c.retirar(montoRetiro));
                            break;
                        case 4:
                            in = false;
                            break;
                        default:
                            System.out.println("Ingrese una opcion correcta");
                    }
                    System.out.println(c.getSaldo());
                }catch (Exception e){
                    System.out.println(e);
                    System.out.println("Ingrese una opcion correcta");
                    sc.next();
                }
            }while (in);
    }
}
