package org.example;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.depositar(500);
        System.out.println("Saldo después de depositar : " + cuenta.getSaldo());

        cuenta.retirar(200);
        System.out.println("Saldo después de retirar 200: " + cuenta.getSaldo());

        boolean retiroExitoso = cuenta.retirar(400);
        System.out.println("Intento de retirar 400: " + (retiroExitoso ? "Exitoso" : "Fallido"));
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}