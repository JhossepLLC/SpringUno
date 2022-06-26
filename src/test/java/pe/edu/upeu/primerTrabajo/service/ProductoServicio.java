/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.primerTrabajo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.primerTrabajo.dao.ProductoDao;
import pe.edu.upeu.primerTrabajo.entity.Producto;

/**
 *
 * @author HP
 */
@Service
public class ProductoServicio {
    
    @Autowired
    private ProductoDao productoDao;
    
    public List<Producto> listAll(){
        return productoDao.findAll();
    }
    
    public void save(Producto producto){
        productoDao.save(producto);
    }
    
    public Producto get(long id){
        return productoDao.findById(id).get();
    }
    
    public void delete(long id){
        productoDao.deleteById(id);
    }
}
