package cuentas;

import java.util.Scanner;

public class Main {
    
    CCuenta cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
    
    double saldoActual;

    public static void main(String[] args) {
        
        Main mainObj = new Main();
        mainObj.menuIntroducirNum();

    }
    
    public void menuIntroducirNum() {
        System.out.println("GESTIÓN DE CUENTA BANCARIA: \n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad a ingresar/retirar: ");
        float cantidad = scanner.nextFloat();
        
        operativa_cuenta(cantidad);

    }
    
    public void operativa_cuenta(float cantidad) {
        saldoActual = cuenta1.estado();
//        System.out.println("El saldo actual es "+ saldoActual );
        
        try {saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
                cuenta1.retirar(2300);
            } catch (Exception e) {
                System.out.print("Fallo al retirar");
            }
            try {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(695);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
        }
    }
}
