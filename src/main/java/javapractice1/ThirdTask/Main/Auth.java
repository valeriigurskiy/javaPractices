package javapractice1.ThirdTask.Main;

public class Auth {
    int id;
    String login;
    String password;

    public Auth() {
    }

    @Override
    public String toString() {
        return "Auth{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Auth(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }
}
