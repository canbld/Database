/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author 2001c
 */
import java.util.ArrayList;
import java.util.List;
public class Row {
    private Table table;
    private List<String> values;
    
    public Row(Table table){
        this.table = table;
        this.values = new ArrayList<>();
    }
    
    public void set(String columnName,String value){
        int columnIndex = getColumnIndex(columnName);
        if(columnIndex != -1){
            while (values.size() <= columnIndex) {
                values.add(null);
            }
            values.set(columnIndex, value);
        }
    }
    public String get(String columnName){
        int columnIndex = getColumnIndex(columnName);
        if (columnIndex != -1 && columnIndex < values.size()) {
            return values.get(columnIndex);
        }
        return null;
    }
    private int getColumnIndex(String columnName) {
        for (int i = 0; i < table.getColumns().size(); i++) {
            if (table.getColumns().get(i).getColumnName().equals(columnName)) {
                return i;
            }
        }
        return -1;
    }
}
