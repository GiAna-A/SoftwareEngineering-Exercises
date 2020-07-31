package sote_abgaben.abgabe3_enums_regularExpressions.exercise1;

public enum Month {

    JANUARY("Januar", 31, Season.WINTER), FEBRUARY("Februar", 28, Season.WINTER);

    String name;
    int days;
    Season season;

     Month(String name, int days, Season season){
        this.name=name;
        this.days=days;
        this.season=season;
    }

   public  int getAmountOfDays(){
         return days;
    }

    public boolean in (Season season){
         return this.season==season;

    }
}
