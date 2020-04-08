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
public class Tiro extends ObjetoDeCena implements ObjetoAutonomo {

    public Tiro(ObjetoDeCena origem) {
        super(origem.getX(),origem.getY());
    }
    
    @Override
    public void movimentar(int x, int y) {
        this.posicaox = x;
        this.posicaoy = y;
    }

    @Override
    public void rodar() {
        while (true) {
            this.posicaoy += 1;
            this.movimentar(posicaox, posicaoy);
        }
    }
    
}
