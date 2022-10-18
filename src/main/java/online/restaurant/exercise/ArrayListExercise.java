package online.restaurant.exercise;

import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList age = new ArrayList();
        //Adding elements in an ArrayList
        age.add(10);
        age.add(20);
        age.add(30);
        age.add(40);
        age.add(50);
        age.add(60);

        for(int i=0; i<age.size();i++){
            System.out.println(age.get(i));
        }
    }
}
