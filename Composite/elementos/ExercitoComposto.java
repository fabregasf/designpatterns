/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arquiteto.elementos;

import com.arquiteto.composite.ComponenteExercito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 * 
 * Essa classe é a que VAI EXECUTAR O TRABALHO REAL, mostrando os dados
 * Execute: cria nó filho
 * Info: mostra informação sobre hierarquia no exército
 * Remove: exclui 
 * 
*/

// Posso estender classe abstrata tbm... 
public class ExercitoComposto implements ComponenteExercito {
    
    ArrayList<ComponenteExercito> listaExercito = new ArrayList<ComponenteExercito>();

    @Override
    public String info() {
        String info = "";
        for (ComponenteExercito item : listaExercito) {
            info += "Estou no nivel: "+item.info();            
        }        
        return info;
    }

    @Override
    public void execute(ComponenteExercito interfacebasica) {        
        listaExercito.add(interfacebasica);
        
    }

    @Override
    public void remove(ComponenteExercito interfacebasica) {
        // procurando indice pelo elemento passado na coleção... 
        int indice = listaExercito.indexOf(interfacebasica);
        
        if(indice != -1) this.listaExercito.remove(indice);   
    }
    
    
    
    
    
}
