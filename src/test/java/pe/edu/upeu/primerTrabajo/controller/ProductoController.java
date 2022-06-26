/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.primerTrabajo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.upeu.primerTrabajo.entity.Producto;
import pe.edu.upeu.primerTrabajo.service.ProductoServicio;

/**
 *
 * @author HP
 */
@Controller
public class ProductoController {
    
    @Autowired
    private ProductoServicio productoServicio;
    
    @RequestMapping("/")
    public String verPaginaDeInicio(Model modelo){
        List<Producto> listaProductos=productoServicio.listAll();
        modelo.addAttribute("listaProductos", listaProductos);
        return "Index";
    }
}
