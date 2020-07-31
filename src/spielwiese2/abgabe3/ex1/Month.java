package spielwiese2.abgabe3.ex1;


public enum Month {
    JANUARY("January",31,Season.WINTER),FEBRUARY("February",28,Season.WINTER);


    String name;
    int days;
    Season season;

    Month(String name, int days, Season season){
        this.name=name;
        this.days=days;
        this.season=season;

    }

    public int getAmountOfDays(){
        return days;
    }
    public String name(String name){
        this.name=name;
        return name;

    }
    public boolean in(Season season){
        if(season==this.season) {
            return true;
        }
        return false;
    }


}
