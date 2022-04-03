package me.dio.web;

public class Main {

    public static void main(String[] args) {
        Cliente nomeCliente = new Cliente();
        nomeCliente.setNome("Pedro");

        Conta contaCorrente = new ContaCorrente(nomeCliente);
        contaCorrente.depositar(100);

        Conta contaPoupanca = new ContaPoupanca(nomeCliente);

        contaCorrente.transferir(100, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }
}
