/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.arquiteto.flyweight;

import com.arquiteto.Criador;

/**
 *
 * @author Usuario
 * 
 * Padrão Flyweight, vamos criar vários atiradores para esse exército
 * Atiradores com características semelhantes terão instância compartilhada na
 * memória
 */
public class Flyweight {

    public static void main(String[] args) {                
        var criandoExercito = new Criador();
        criandoExercito.trocaArmas();
        
        
    }
}
