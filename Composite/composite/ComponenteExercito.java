/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.arquiteto.composite;

/**
 *
 * @author Usuario
 * Métodos genéricos que podem ser chamados por objetos com hierarquias diferentes
 */
public interface ComponenteExercito {
    String info();
    void execute(ComponenteExercito interfacebasica); 
    void remove(ComponenteExercito interfacebasica);
}
