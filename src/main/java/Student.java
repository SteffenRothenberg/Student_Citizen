import java.util.Objects;

public abstract class Student {
    protected String name;

    public Student(){

    }
    public Student(String name){
        this.name = name;
    }
    abstract String getNameAndAddress();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return Objects.equals(name, student.name);
    }
      public abstract String areaOfExpertise();


    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
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
                "name='" + name + '\'' +
                '}';
    }
}
