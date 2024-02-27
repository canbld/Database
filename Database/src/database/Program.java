/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author 2001c
 */
public class Program {

    public static void main(String[] args) {

        Table table = new Table("TblStudent");
        table.getColumns().add(new Column("No"));
        table.getColumns().add(new Column("Name"));
        table.getColumns().add(new Column("Surname"));

        Row row = table.newRow();
        row.set("No", "123");
        row.set("Name", "Ahmet");
        table.getRows().add(row);

        Row row2 = table.newRow();
        row2.set("No", "456");
        row2.set("Name", "Mehmet");
        table.getRows().add(row2);


        table.getRows().get(1).set("No", "345");

        for (Row item : table.getRows()) {
            System.out.printf("No: %s\tName: %s\tSurname: %s\n",item.get("No"),item.get("Name"),item.get("Surname"));
        }
        
        System.out.println();
        System.out.println(table.getRows().get(1).get("No"));
        

    }
}
