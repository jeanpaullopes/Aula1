/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniritter.canoas.poo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jean
 */
public class CalculadoraController {
    private float op1,op2;
    private String operacao;
    private Map<String,Operacao> operacoes;
    
    public CalculadoraController() {
        this.operacoes = new HashMap();
        this.operacoes.put("+",new Soma());
        this.operacoes.put("^",new Potencia());
        //this.operacoes[2] = new Soma();
        //this.operacoes[3] = new Soma();
    }
    public CalculadoraController(Map<String,Operacao> operacoes) {
        this.operacoes = operacoes;
    }
    
    
    private void escolheOperacao() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("escolha operação ( + - * / ^ ) ");
        this.operacao = scan.next();
    }
    
    private void entrada1() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Informe operador 1:");
        this.op1 = scan.nextInt();
    }
    private void entrada2() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Informe operador 2:");
        this.op2 = scan.nextInt();
    }
    
    
    private String descreverOperacao() {
        return (this.op1+" "+this.operacao+ " "+this.op2+ " = ");
    }
    
    public void run() {
        while(true) {
            this.entrada1();
            this.escolheOperacao();
            this.entrada2();
        
            System.out.println(this.descreverOperacao()
                    +this.operacoes.get(this.operacao).calcular(op1, op2)
                    );
        }
                
                
    }
    public void iniciaCalculadora() {
        CalculadoraView cv = new CalculadoraView(this);
        for (String op : this.operacoes.keySet()) {
            cv.addOperacao(op);
        }
        cv.setVisible(true);
    }
    
    public String calcula(String calc) {
        System.out.println("===>");
        System.out.println(calc);
        String[] split = calc.split(" ");
        String op1 = split[0];
        String op2 = split[2];
        String operacao = split[1];
        float fop1 = Float.parseFloat(op1);
        float fop2 = Float.parseFloat(op2);
        Operacao objOperacao = this.operacoes.get(operacao);
        float resp = objOperacao.calcular(fop1, fop2);
        System.out.println(resp);
        return resp + "";
        
        
    }
    
}
