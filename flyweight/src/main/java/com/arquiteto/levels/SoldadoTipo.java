/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arquiteto.levels;

import com.arquiteto.shared.OperacoesShared;

/**
 *
 * @author Fabricio
 * Bora preencher cada guerreiro com suas armas
 * 
 */

public class SoldadoTipo implements OperacoesShared {

    

    @Override
    public void trocarArma() {
        System.out.println("Sou um soldado, e troquei de arma: "+ System.identityHashCode(this));       
        System.out.println();
    }
    
}
