public class Student {

    private String name;
    private int age;
    private String specialization;
    private int semester;
    private int index;

    public String getName(String name) {
        return name;
    }
    public int getAge(int age) {
        return age;
    }
    public String getSpecialization(String specialization) {
        return specialization;
    }
    public int getSemester(int semester) {
        return semester;
    }
    public double getIndex(int index) {
        return index;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    @Override
    public void setSemester(int semester) {
        this.semester = semester;
    }
    @Override
    public void setIndex(int index) {
        this.index = index;
    }
    @Override
    public String toString() {
        return "Student{" +
                "imie='" + name + '\'' +
                ", wiek=" + age +
                ", kierunek='" + specialization + '\'' +
                ", semestr=" + semester +
                ", indeks=" + index +
                '}';
    }
}