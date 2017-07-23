/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.yasves.entidades.clsLugar;
import com.yasves.entidades.clsSector;
import com.yasves.funciones.crudLugar;
import com.yasves.funciones.crudSector;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rocby
 */
public class testlista {
    public static void main(String[] args) {
        
        List<clsSector> lista;
        
        lista= crudSector.findbyAll();
        
        for (clsSector lista1 : lista) {
            System.out.println(" ***** " + lista1.getId());
            System.out.println(" ***** " + lista1.getCodigo_sector());
            System.out.println(" ***** " + lista1.getObservacion());
        } 
        
    }
}
