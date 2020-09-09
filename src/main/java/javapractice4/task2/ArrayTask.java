package javapractice4.task2;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTask {
    public void showResult(int key){
        List<Integer> numsArray = new LinkedList<>();
        numsArray.add(1);
        numsArray.add(2);
        numsArray.add(3);
        numsArray.add(4);
        numsArray.add(4);
        numsArray.add(4);
        numsArray.add(4);
        numsArray.add(7);
        numsArray.add(7);
        numsArray.add(9);
        numsArray.add(14);
        System.out.println("first index: " + numsArray.indexOf(key));
        System.out.println("last index: " + numsArray.lastIndexOf(key));
    }
}
