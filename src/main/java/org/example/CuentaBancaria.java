package org.example;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {
        this.saldo = 0.0;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }
    public boolean retirar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    public double getSaldo() {
        return this.saldo;
    }
}
