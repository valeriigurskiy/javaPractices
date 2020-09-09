package javapractice4.task1;

import java.util.Objects;

public class Owner {
    private String name;
    private int age;
    private int experience;

    @Override
    public String toString() {
        return "task1.Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return age == owner.age &&
                experience == owner.experience &&
                Objects.equals(name, owner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, experience);
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Owner(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
}
