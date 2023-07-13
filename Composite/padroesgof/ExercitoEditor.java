/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arquiteto.padroesgof;

import com.arquiteto.composite.ComponenteExercito;
import com.arquiteto.elementos.ExercitoComposto;
import com.arquiteto.elementos.ExercitoLeaf;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 * Aqui testo as composicoes do Exército. Posso ter
 * outras composições. Exemplo: validação
 */
public class ExercitoEditor {
    
    ExercitoComposto lista;
    
    // Aqui eu crio a Caixa, contendo outros objetos
    public void criaCaixa(){
        lista = new ExercitoComposto();
        lista.execute(new ExercitoLeaf("brigada", 3));
        lista.execute(new ExercitoLeaf("pelotao", 4));
        lista.execute(new ExercitoLeaf("divisão", 2));   
        
    }
    
    // Aqui eu pego as informações
    public void retornaInformacoes(){       
        lista.info();
    }
    
    public void deletaItem(){        
        lista.remove(lista);        
    }
}
