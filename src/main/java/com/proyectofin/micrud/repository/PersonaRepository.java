/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectofin.micrud.repository;

import com.proyectofin.micrud.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonaRepository extends JpaRepository<Persona,Long> {
    
}
