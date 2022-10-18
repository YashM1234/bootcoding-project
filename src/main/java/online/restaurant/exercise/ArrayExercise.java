package online.restaurant.exercise;

public class ArrayExercise {
    public static void main(String[] args) {
        //Array Declaration and Initialization
        int[] number = {10, 20, 30, 40, 50};
        //Array Declaration
        int[] age = new  int[5];
        //Initialization of an Array
    //    age[0] = 10;
    //    age[1] = 20;
    //    age[2] = 30;
    //    age[3] = 40;
    //    age[4] = 50;
        //Initialization of an Array using for loop
        for(int i=0; i<age.length;i++){
            age[i] = (i+1)*10;
        }
        //Array traversing
        for(int i=0; i< age.length; i++){
            System.out.println(i +" = " + age[i]);
        }
        System.out.println();
        //Array of Strings
        String[] months = {
                "January", "February", "March",
                "April", "May", "June", "July",
                "August", "September", "October",
                "November", "December"
        };
        //Traversing String Array
        for(int i = 0; i< months.length; i++){
            System.out.println(months[i]);
        }

    }
}
