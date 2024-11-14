/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import domain.Rok;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class ModelTableRok extends AbstractTableModel {
    List<Rok> rok=new ArrayList<>();
    private final String[] kolone={"naziv","datump","datumz"};

    public ModelTableRok(List<Rok> rok) {
        this.rok=rok;
    }
    
    @Override
    public int getRowCount() {
        return rok.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Rok r=rok.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> r.getNaziv();
            case 1 -> r.getDatump().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            case 2 -> r.getDatumz().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            default -> "N/A";
        };
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public List<Rok> getRok() {
        return rok;
    }

    public void setRok(List<Rok> rok) {
        this.rok = rok;
    }
    
}
