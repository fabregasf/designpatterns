/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arquiteto.padroesgof;

/**
 *
 * @author Usuario
 */
public class Init {
    public static void main(String[] args) {
        ExercitoEditor editordeComponente = new ExercitoEditor();
        
        editordeComponente.criaCaixa();
        editordeComponente.retornaInformacoes();
        
        // Vamos remover o primeiro elemento inserido
        editordeComponente.deletaItem();
        
    
    }
}
