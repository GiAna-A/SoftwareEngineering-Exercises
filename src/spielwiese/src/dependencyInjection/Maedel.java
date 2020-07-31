package spielwiese.src.dependencyInjection;

public class Maedel implements Human {
    private String surName;
    private String name;

    public Maedel(String surName, String name) {
        this.surName = surName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
}
