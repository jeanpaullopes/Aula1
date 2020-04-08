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
public abstract class ObjetoDeCena {
    protected int posicaox;
    protected int posicaoy;
    
    protected ObjetoDeCena(int x, int y) {
        this.posicaox = x;
        this.posicaoy =y;
    }
    public abstract void  movimentar(int x, int y);

    public int getX() {
        return posicaox;
    }

    public int getY() {
        return posicaoy;
    }
           
    
}
