package sote_abgaben.abgabe1_inheritance_interfaces.databases;

public class DBWriter {
    private Database database;

    public DBWriter (Database database){
        this.database=database;
    }
    public void searchDatabase(String text){

        database.searchList(text);
    }
}
