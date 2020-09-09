package javapractice5;

public class Actor {
    private int actor_id;
    private String firstName;
    private String lastName;
    private String last_update;

    @Override
    public String toString() {
        return "Actor{" +
                "actor_id=" + actor_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", last_update='" + last_update + '\'' +
                '}';
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    public Actor(int actor_id, String firstName, String lastName, String last_update) {
        this.actor_id = actor_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.last_update = last_update;
    }
}
