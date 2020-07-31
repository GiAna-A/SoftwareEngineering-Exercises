package spielwiese2.abgabe1.ex2;

public class Search {
    static DbBlueprint db;
    public Search(DbBlueprint db){
        this.db=db;
    }
    public void search(String text){
        db.searchList( text);

    }
}
