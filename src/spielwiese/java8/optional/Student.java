package spielwiese.java8.optional;

public class Student {
    private int age;
    private String name;
    private boolean hatUrlaubssemester;
    private int handynummer;

    public Student(int age, String name, boolean hatUrlaubssemester, int handynummer) {
        this.age = age;
        this.name = name;
        this.hatUrlaubssemester = hatUrlaubssemester;
        this.handynummer = handynummer;
    }



    public boolean isHatUrlaubssemester() {
        return hatUrlaubssemester;
    }

    public void setHatUrlaubssemester(boolean hatUrlaubssemester) {
        this.hatUrlaubssemester = hatUrlaubssemester;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
