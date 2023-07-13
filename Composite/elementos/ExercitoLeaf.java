/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arquiteto.elementos;

/**
 *
 * @author Usuario
 * Um nivel isolado "Folha"
 * 
 */
public class ExercitoLeaf extends ExercitoComposto {
    
    String nivelNome;
    int nivelNumero;
    
    public ExercitoLeaf(String nomeNivel, int nivel){
        super();
        this.nivelNome = nomeNivel; this.nivelNumero = nivel;        
    }

    @Override
    public String info() {
        return "Sou um: "+this.nivelNome+" - "+this.nivelNumero;
    }
    
    
  
    
    
}
