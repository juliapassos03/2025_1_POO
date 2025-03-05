/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exe02;

/**
 *
 * @author passos
 */
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public void setSaldo(double saldo) {
       this.saldo = saldo;
    }
    
    public void setNumero(String numero){
        if (numero.trim().isEmpty()){
            throw new IllegalArgumentException("Numero invalido");
        }    
        this.numero = numero;
    }
    
    public void setTitular(String titular){
        if (numero.trim().isEmpty()){
            throw new IllegalArgumentException("Titular invalido");
        }
        this.titular = titular;
    }
    public String getTitular(){
        return this.titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    public String getNumero() {
        return numero;
    }
    
    public void depositar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor para depositar invalido");
        }
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        if(valor <= 0 || valor > this.saldo){
            throw new IllegalArgumentException("Valor para sacar invalido ou saldo insuficiente");
        }
        this.saldo -= valor;           
    }
    
    public void transferir(ContaBancaria destino, double valor){
        sacar(valor);
        destino.depositar(valor);
    }
    
}
