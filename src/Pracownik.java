public class Pracownik {
    private String name;
    private int age;
    private String post;
    private int experience;
    private double salary;

    public String getName(String name) {
        return name;
    }
    public int getAge(int age) {
        return age;
    }
    public String getPost(String post) {
        return post;
    }
    public int getExperience(int experience) {
        return experience;
    }
    public double getSalary(double salary) {
        return salary;
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
    public void setPost(String post) {
        this.post = post;
    }
    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }
    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + name + '\'' +
                ", wiek=" + age +
                ", stanowisko='" + post + '\'' +
                ", staz=" + experience +
                ", pensja=" + salary +
                '}';
    }
}



