package spielwiese.hackerrun;

public class Player {   //implements Comparable<Player>
   private String name;
    private int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

  /*  @Override
    public int compareTo(Player o) {
        return this.name.compareTo(name);
    }*/
}
