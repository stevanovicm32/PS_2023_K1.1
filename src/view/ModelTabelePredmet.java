/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import domain.Predmet;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class ModelTabelePredmet extends AbstractTableModel {
    List<Predmet> predmet=new ArrayList<>();
    public final String[] kolone={"naziv","espb","datum"};
    
    public ModelTabelePredmet(List<Predmet> predmet)
    {
        this.predmet=predmet;
    }
    
    @Override
    public int getRowCount() {
        return predmet.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Predmet p=predmet.get(rowIndex);
        return switch(columnIndex)
        {
            case 0->p.getNaziv();
            case 1->p.getEspb();
            case 2->p.getDatum().format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
            default->"N/A";
        };
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
    
}
