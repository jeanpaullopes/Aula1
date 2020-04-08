/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniritter.canoas.poo;

/**
 *
        
        
    }
    }
 * @author jean
 */
public abstract class Operacao {
    protected char simbolo;
    
    public abstract float calcular(float op1, float op2);
    
    public char getSimbolo() {
        return this.simbolo;
    }
    
}
