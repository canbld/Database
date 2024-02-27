/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author 2001c
 */
public class Column {
    private String columnName;
    
    public Column(String columnName){
        this.columnName = columnName;
    }
    
    public String getColumnName(){
        return columnName;
    }
}
