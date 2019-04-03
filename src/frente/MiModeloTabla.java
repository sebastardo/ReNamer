/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frente;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sebastian
 */
public class MiModeloTabla extends AbstractTableModel {

    private List<File> lista;
    private static final String[] encabezado = {"Nombre","Path"};
    
    public MiModeloTabla() {
        lista = new ArrayList<>();
    }

    public void setLista(List<File> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }
    
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return encabezado.length;
    }
    
    @Override
    public String getColumnName(int i) {
        return encabezado[i];
    }

    @Override
    public Object getValueAt(int fila, int col) {
        
        File archivo = lista.get(fila);

        switch (col) {
            case 0:
                return archivo.getName();
            case 1:
                return archivo.getPath();
            default:
                return null;
        }
    }
    
}
