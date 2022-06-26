/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.primerTrabajo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.primerTrabajo.entity.Producto;

/**
 *
 * @author HP
 */

public interface ProductoDao extends JpaRepository<Producto, Long>{
    
}
