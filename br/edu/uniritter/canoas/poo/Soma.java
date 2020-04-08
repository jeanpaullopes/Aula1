/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniritter.canoas.poo;

/**
 *
 * @author jean
 */
public class Soma extends Operacao {

    public Soma() {
        simbolo = '+';
    }
    @Override
    public float calcular(float op1, float op2) {
        return op1 + op2;
    }
    public float calcular(float op1) {
        return op1 * 2;
    }
    
}
