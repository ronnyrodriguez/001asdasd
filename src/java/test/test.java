/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.yasves.entidades.clsLugar;
import com.yasves.entidades.clsPro_det;
import com.yasves.entidades.clsSector;
import com.yasves.funciones.crudLugar;
import com.yasves.funciones.crudPro_det;
import com.yasves.funciones.crudSector;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;



public class test {
   

    public static void main(String[] args) throws ParseException {
        
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date());
//        int calendarTime = Calendar.DAY_OF_MONTH;
//        int temp = calendar.get(calendarTime);
//        calendar.set(calendarTime, temp); /* elimina el +7*/
//
//        SimpleDateFormat formatoFecha = new SimpleDateFormat();
//        formatoFecha.setTimeZone(TimeZone.getTimeZone("GMT-6"));
//        Date fechaSum = calendar.getTime();
//        formatoFecha.applyPattern("dd/MM/yyyy");
//        String fechaRespuesta = formatoFecha.format(fechaSum);
//        Date fechaDate = null;
//        fechaDate = formatoFecha.parse(fechaRespuesta);
        
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                
        
        clsLugar l=new clsLugar(1, null, null);
        clsSector s=new clsSector(1,"PP_puyo",12,"Rio de aproximadamente 12 m de profundidad",l);
      
        
        clsPro_det a=new clsPro_det(0,25,sqlDate,s);
        crudPro_det b=new crudPro_det();
        b.save(a);
//        System.out.println(fechaRespuesta);
        
    
        
    }
}
