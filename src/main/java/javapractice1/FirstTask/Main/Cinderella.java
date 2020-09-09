package javapractice1.FirstTask.Main;

public class Cinderella {
    private String name;
    private int age;
    private int feetSize;
    private Prince prince;

    @Override
    public String toString() {
        return "Cinderella{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", feetSize=" + feetSize +
                ", prince=" + prince +
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

    public int getFeetSize() {
        return feetSize;
    }

    public void setFeetSize(int feetSize) {
        this.feetSize = feetSize;
    }

    public Prince getPrince() {
        return prince;
    }

    public void setPrince(Prince prince) {
        this.prince = prince;
    }

    public Cinderella() {
    }

    public Cinderella(String name, int age, int feetSize, Prince prince) {
        this.name = name;
        this.age = age;
        this.feetSize = feetSize;
        this.prince = prince;
    }
}
