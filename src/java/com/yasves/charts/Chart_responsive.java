/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yasves.charts;

import com.yasves.entidades.clsPro_det;
import com.yasves.ln.ln_prodet;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartSeries;
 
@ManagedBean
public class Chart_responsive implements Serializable {
 
    private LineChartModel lineModel1;
    private LineChartModel lineModel2;
     
    @PostConstruct
    public void init() {
        createLineModels();
    }
 
    public LineChartModel getLineModel1() {
        return lineModel1;
    }
 
    public LineChartModel getLineModel2() {
        return lineModel2;
    }
     
    private void createLineModels() {
        lineModel1 = initLinearModel();
        lineModel1.setTitle("Linear Chart");
        lineModel1.setLegendPosition("e");
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);
         
        lineModel2 = initCategoryModel();
        lineModel2.setTitle(" Informe Anual ");
        lineModel2.setZoom(true);
        lineModel2.setLegendPosition("e");
        lineModel2.setShowPointLabels(true);
        lineModel2.getAxes().put(AxisType.X, new CategoryAxis(" Meses del Año "));
        yAxis = lineModel2.getAxis(AxisType.Y);
        yAxis.setLabel("Flujo del Rio");
        yAxis.setMin(0);
        yAxis.setMax(500);
    }
     
    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
 
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 1");
 
        series1.set(1, 2);
        series1.set(2, 1);
        series1.set(3, 3);
        series1.set(4, 6);
        series1.set(5, 8);
 
        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Series 2");
 
        series2.set(1, 6);
        series2.set(2, 3);
        series2.set(3, 2);
        series2.set(4, 7);
        series2.set(5, 9);
 
        model.addSeries(series1);
        model.addSeries(series2);
         
        return model;
    }
     
    private LineChartModel initCategoryModel() {
        LineChartModel model = new LineChartModel();
        int mes=0;
        int codigo_sector=1;
        
        
        
        ChartSeries boys = new ChartSeries();
            
            java.sql.Date Mayoi = new java.sql.Date(2017-1900, mes+4, 1);
            java.sql.Date Mayof = new java.sql.Date(2017-1900, mes+4, 28);
            clsPro_det my=null;
            my=ln_prodet.mayorcf(Mayoi, Mayof, codigo_sector);
            boys.set("Mayo",my.getPromedio());
        
            java.sql.Date Junioi = new java.sql.Date(2017-1900, mes+5, 1);
            java.sql.Date Juniof = new java.sql.Date(2017-1900, mes+5, 28);
            clsPro_det jn=null;
            jn=ln_prodet.mayorcf(Junioi, Juniof, codigo_sector);
            boys.set("Junio",jn.getPromedio());
            
            java.sql.Date Julioi = new java.sql.Date(2017-1900, mes+6, 1);
            java.sql.Date Juliof = new java.sql.Date(2017-1900, mes+6, 28);
            clsPro_det jl=null;
            jl=ln_prodet.mayorcf(Julioi, Juliof, codigo_sector);
            boys.set("Julio",jl.getPromedio());
            
            java.sql.Date agi = new java.sql.Date(2017-1900, mes+7, 1);
            java.sql.Date agf = new java.sql.Date(2017-1900, mes+7, 28);
            clsPro_det ag=null;
            ag=ln_prodet.mayorcf(agi, agf, codigo_sector);
            boys.set("Agosto",ag.getPromedio());
        
            java.sql.Date spi = new java.sql.Date(2017-1900, mes+8, 1);
            java.sql.Date spf = new java.sql.Date(2017-1900, mes+8, 28);
            clsPro_det sp=null;
            sp=ln_prodet.mayorcf(spi, spf, codigo_sector);
            boys.set("Septiembre",sp.getPromedio());
            
            java.sql.Date oci = new java.sql.Date(2017-1900, mes+9, 1);
            java.sql.Date ocf = new java.sql.Date(2017-1900, mes+9, 28);
            clsPro_det oc=null;
            oc=ln_prodet.mayorcf(oci, ocf, codigo_sector);
            boys.set("Octubre",oc.getPromedio());
            
            java.sql.Date nvi = new java.sql.Date(2017-1900, mes+10, 1);
            java.sql.Date nvf = new java.sql.Date(2017-1900, mes+10, 28);
            clsPro_det nv=null;
            nv=ln_prodet.mayorcf(nvi, nvf, codigo_sector);
            boys.set("Noviembre",nv.getPromedio());
            
            java.sql.Date dci = new java.sql.Date(2017-1900, mes+11, 1);
            java.sql.Date dcf = new java.sql.Date(2017-1900, mes+11, 28);
            clsPro_det dc=null;
            dc=ln_prodet.mayorcf(dci, dcf, codigo_sector);
            boys.set("Diciembre",dc.getPromedio());
            
 
        model.addSeries(boys);
         
        return model;
    }
 
}

