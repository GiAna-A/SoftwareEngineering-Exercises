package spielwiese2.classcodes.java8.functionalInterfaces;

public class Student implements Comparable<Student>{
    String name;
   public Integer age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        return age.compareTo(o.age);
    }
}
