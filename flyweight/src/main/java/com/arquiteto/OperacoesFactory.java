/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arquiteto;

import com.arquiteto.define.ArmaTipo;
import static com.arquiteto.define.ArmaTipo.DOZE;
import com.arquiteto.levels.CoronelTipo;
import com.arquiteto.levels.RecrutaTipo;
import com.arquiteto.levels.SargentoTipo;
import com.arquiteto.levels.SoldadoTipo;
import com.arquiteto.levels.SubtenenteTipo;
import com.arquiteto.shared.OperacoesShared;
import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class OperacoesFactory{
    
    private final Map<ArmaTipo, OperacoesShared> armas;
    
    public OperacoesFactory(){
        armas = new EnumMap<>(ArmaTipo.class);
    }
    
    // recria atirador modificado cada vez que for solicitado
    OperacoesShared recriaAtirador(ArmaTipo sharedtype){             
        
        var arma = armas.get(sharedtype);  
        
        // aqui não pula o NullPointer, não é uma boa prática deixar        
        if (arma == null) {
            switch (sharedtype) {
              case PISTOLA -> {
                arma = new SoldadoTipo();
                armas.put(sharedtype, arma);
              }
              case BAZUCA -> {
                arma = new CoronelTipo();
                armas.put(sharedtype, arma);
              }
              case DOZE -> {
                arma = new SubtenenteTipo();
                armas.put(sharedtype, arma);
              }
              case FUZIL -> {
                arma = new SargentoTipo();
                armas.put(sharedtype, arma);
              }
              case METRALHADORA -> {
                arma = new RecrutaTipo();
                armas.put(sharedtype, arma);
              }
              default -> { // começa com faca
                  arma = new SoldadoTipo();
                  armas.put(ArmaTipo.FACA, arma);
              }
            }
        }
        return arma;
    }
        
    
    
}
