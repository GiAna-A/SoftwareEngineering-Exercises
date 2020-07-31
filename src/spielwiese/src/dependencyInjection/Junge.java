package spielwiese.src.dependencyInjection;

public class Junge implements Human{
    private String name;
    private String surname;

    public Junge(String name, String surName) {
        this.name=name;
        this.surname=surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
