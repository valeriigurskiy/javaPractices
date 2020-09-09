package javapractice1.ThirdTask.Main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person personArray[] = {new Person(1, "vaysa", 32),
                new Person(2, "petya", 31),
                new Person(3, "kolya", 30),
                new Person(4, "anya", 29),
                new Person(5, "masha", 28),
                new Person(6, "andriy", 30),
                new Person(7, "maxim", 31),
                new Person(8, "vadym", 32),
                new Person(9, "taras", 33)};

        Auth authArray[] = {new Auth(5, "login5", "password5"),
                new Auth(2, "login2", "password2"),
                new Auth(1, "login1", "password1"),
                new Auth(7, "login7", "password7"),
                new Auth(3, "login3", "password3"),
                new Auth(4, "login4", "password4"),
                new Auth(8, "login8", "password8"),
                new Auth(6, "login6", "password6"),
                new Auth(9, "login9", "password9")};

        ArrayList finalArray = new ArrayList();

        for(int i = 0; i < personArray.length; i++){
            for(int j = 0; j < authArray.length; j++){
                if(personArray[i].getId() == authArray[j].getId()) {
                    personArray[i].setAuth(authArray[j]);
                    finalArray.add(personArray[i]);
                }
                else{
                    System.out.println("error");
                }
            }
        }
        System.out.println(finalArray.toString());
    }
}

