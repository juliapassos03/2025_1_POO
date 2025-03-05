/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe02;

/**
 *
 * @author passos
 */
public class Exe02 {

    public static void main(String[] args) {
        ContaBancaria c1;
        ContaBancaria c2;
        c1 = new ContaBancaria();
        c1.setNumero("122-3");
        c1.setTitular("Julia");
        
        c2 = new ContaBancaria();
        c2.setNumero("122-4");
        c2.setTitular("Joao");
        
        c1.depositar(1000);
        c1.depositar(700);
        
        c2.depositar(5000);
        c2.sacar(3000);
        c2.transferir(c1, 1800);
        
        System.out.println("Titular conta 1: " + c1.getTitular() + " | Saldo: " + c1.getSaldo());        
        System.out.println("Titular conta 2: " + c2.getTitular() + " | Saldo: " + c2.getSaldo());

    }
}
