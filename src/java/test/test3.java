/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.yasves.entidades.clsPro_det;
import com.yasves.entidades.clsSector;
import com.yasves.funciones.crudPro_det;
import com.yasves.funciones.crudSector;
import com.yasves.ln.ln_prodet;
import java.util.ArrayList;

/**
 *
 * @author Rocby
 */
public class test3 {
    public static void main(String[] args) {
//        ArrayList<clsPro_det> a=new ArrayList<>();
//        int b;
//        
//        java.util.Date utilDate = new java.util.Date();
//        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
//        java.sql.Date sqlDate1 = new java.sql.Date(2017-1900, 0, 14);
//        System.out.println(sqlDate1);
//        
//        b = ln_prodet.mayorcf(sqlDate1,sqlDate,1);
//        System.out.println(b);
        
//      
//        java.sql.Date Eneroi = new java.sql.Date(2017-1900, 6, 1);
//        java.sql.Date Enerof = new java.sql.Date(2017-1900, 6, 31);
//        clsPro_det qw=null;
//        qw=ln_prodet.mayorcf(Eneroi, Enerof, 1);
//        double a=qw.getPromedio();
//        System.out.println(a);
         int mes=0;
         java.sql.Date dci = new java.sql.Date(2017-1900, mes+11, 1);
            java.sql.Date dcf = new java.sql.Date(2017-1900, mes+11, 28);
            clsPro_det dc=null;
            dc=ln_prodet.mayorcf(dci, dcf, 1);
            System.out.println("Diciembre"+dc.getPromedio());
        
    }
}
