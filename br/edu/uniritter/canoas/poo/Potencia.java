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
public class Potencia extends Operacao{

    @Override
    public float calcular(float op1, float op2) {
        float ret = op1;
        for (int i = 2; i <= op2; i++) {
            ret = ret * op1;
        }
        return ret;
    }
    
}
