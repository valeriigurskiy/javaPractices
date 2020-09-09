package javapractice2.task2;

public class Runners implements RunnerInterface{
    private String name;
    private int age;
    private Sex sex;

    @Override
    public String toString() {
        return "Runners{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Runners(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public void run() {
        System.out.println(getSex() + " named " + getName() + " runned 2 km");
    }
}
