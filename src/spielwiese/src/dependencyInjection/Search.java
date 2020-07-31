package spielwiese.src.dependencyInjection;

public class Search {
    private static DB myDB;

    public Search(DB myDB) {
        this.myDB = myDB;
    }

  /*  public void searchList(Maedel maedel) {
        myDB.search(maedel);

    }*/
 /* public  void searchList(String name, String surName){
      myDB.search(name, surName);

  }*/

 public void searchList (Human human){
     myDB.search(human);
 }

}
