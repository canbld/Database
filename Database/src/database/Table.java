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

public class Table {
    private String tableName;
    private List<Column> columns;
    private List<Row> rows;
    
    public Table(String tableName){
        this.tableName = tableName;
        this.columns = new ArrayList<>();
        this.rows = new ArrayList<>();
    }
    
    public List<Column> getColumns(){
        return columns;
    }
    public List<Row> getRows(){
        return rows;
    }
    public Row newRow(){
        return new Row(this);
    }
    public String getTableName(){
        return  tableName;
    }
}
