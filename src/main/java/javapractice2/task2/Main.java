package javapractice2.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Singers> singers = new ArrayList<>();
        Singers singer1 = new Singers("Ivan",22, Sex.Man);
        Singers singer2 = new Singers("Gloria",31, Sex.Woman);
        Singers singer3 = new Singers("Natalia",25, Sex.Woman);
        Singers singer4 = new Singers("Vasya",18, Sex.Man);
        Singers singer5 = new Singers("Petro",33, Sex.Man);

        singers.add(singer1);
        singers.add(singer2);
        singers.add(singer3);
        singers.add(singer4);
        singers.add(singer5);

        for(int i = 0; i < singers.size(); i++){
            singers.get(i).sing();
        }
        System.out.println("\n");

        ArrayList<Runners> runners = new ArrayList<>();
        Runners runner1 = new Runners("Ivan",22, Sex.Man);
        Runners runner4 = new Runners("Vasya",18, Sex.Man);
        Runners runner3 = new Runners("Natalia",25, Sex.Woman);
        Runners runner5 = new Runners("Petro",33, Sex.Man);
        Runners runner2 = new Runners("Gloria",31, Sex.Woman);

        runners.add(runner1);
        runners.add(runner2);
        runners.add(runner3);
        runners.add(runner4);
        runners.add(runner5);

        for(int i = 0; i < runners.size(); i++){
            runners.get(i).run();
        }

    }
}
