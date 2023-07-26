/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arquiteto;

import com.arquiteto.define.ArmaTipo;
import com.arquiteto.shared.OperacoesShared;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Criador {
    
    private List<OperacoesShared> pelotaoum;
    private List<OperacoesShared> pelotaodois;    
    
    public Criador(){
        var factory = new OperacoesFactory();
        // aqui tem todas as categorias
        pelotaoum = List.of(
            factory.recriaAtirador(ArmaTipo.BAZUCA),
            factory.recriaAtirador(ArmaTipo.DOZE),
            factory.recriaAtirador(ArmaTipo.FUZIL),
            factory.recriaAtirador(ArmaTipo.NENHUM),
            factory.recriaAtirador(ArmaTipo.METRALHADORA),
            factory.recriaAtirador(ArmaTipo.PISTOLA)
        );   
        // aqui só tem soldado
        pelotaodois = List.of(
            factory.recriaAtirador(ArmaTipo.PISTOLA),
            factory.recriaAtirador(ArmaTipo.PISTOLA),
            factory.recriaAtirador(ArmaTipo.PISTOLA),
            factory.recriaAtirador(ArmaTipo.PISTOLA)
        );
        
    }   
    public List<OperacoesShared> getPelotaoum() {
        return List.copyOf(this.pelotaoum);        
    }
   
    public List<OperacoesShared> getPelotaodois() {
        return List.copyOf(this.pelotaodois);
    }
    
    public void trocaArmas() {        
        System.out.println("Pelotao um IDs de objeto\n");
        pelotaoum.forEach(OperacoesShared::trocarArma); 
        System.out.println("Pelotao dois IDs de objeto\n");
        pelotaodois.forEach(OperacoesShared::trocarArma);
           
  }
}
