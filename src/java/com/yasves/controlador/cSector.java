package com.yasves.controlador;



import com.yasves.entidades.clsLugar;
import com.yasves.entidades.clsSector;
import com.yasves.funciones.crudSector;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

@ManagedBean
@ViewScoped
public class cSector {
    private List<clsSector> lista;
    private clsSector newSector;
    private int newlugar;
    private clsSector selectedSector;
   
    public cSector() {
        newSector = new clsSector();
        cargarDatos();        
    }

    public void insertar(){
        
        clsLugar l=new clsLugar(newlugar, null, null);
        clsSector s=new clsSector(newSector.getId(),newSector.getCodigo_sector(),newSector.getDistancia(),newSector.getObservacion(), l);
       
        if (crudSector.save(s)) { //linea guarda el cliente 
           newSector= new clsSector();//prepara el constructor posible nuevo cliente 
           cargarDatos(); //refresca el datagrid con los nuevos cambios
           //TODO:mostrar mensaje de guardar 
        }else{
        //TODO:mostrar mensaje de no guardardo 
        }
    }
    public void eliminar(){
        if (crudSector.delete(selectedSector)) {
            newSector = new clsSector();//prepara el constructor posible nuevo cliente 
           cargarDatos(); //refresca el datagrid con los nuevos cambios
           //TODO:mostrar mensaje deeliminar 
        }else{
        //TODO:mostrar mensaje de no eliminado
        }
    }
    public void actualizar(){
         clsLugar l=new clsLugar(newlugar, null, null);
        clsSector s=new clsSector(newSector.getId(),newSector.getCodigo_sector(),newSector.getDistancia(),newSector.getObservacion(), l);
       
        if (crudSector.update(s)) {
            newSector = new clsSector();//prepara el constructor posible nuevo cliente 
           cargarDatos(); //refresca el datagrid con los nuevos cambios
           //TODO:mostrar mensaje de actualizar
        }else{
        //TODO:mostrar mensaje de no actualizar
        }
    }
    
    private void cargarDatos() {
        lista= crudSector.findbyAll();
    }

    public List<clsSector> getLista() {
        return lista;
    }

    public void setLista(List<clsSector> lista) {
        this.lista = lista;
    }

    public clsSector getNewSector() {
        return newSector;
    }

    public void setNewSector(clsSector newSector) {
        this.newSector = newSector;
    }

    public clsSector getSelectedSector() {
        return selectedSector;
    }

    public void setSelectedSector(clsSector selectedSector) {
        this.selectedSector = selectedSector;
    }

    public int getNewlugar() {
        return newlugar;
    }

    public void setNewlugar(int newlugar) {
        this.newlugar = newlugar;
    }

}
