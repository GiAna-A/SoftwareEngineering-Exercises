package spielwiese.sort;

public class Student implements Comparable<Student> {
    private Integer id;
    private String fname;
    private Double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public Integer getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public Double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return id.compareTo(o.id);
    }
}
