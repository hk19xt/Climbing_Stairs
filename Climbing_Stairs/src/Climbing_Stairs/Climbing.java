package Climbing_Stairs;

public class Climbing {
    public int climbing(int userValue){

        int first_value = 1;
        int second_value = 2;

        if(userValue == 0){
            return 1;
        }
        if(userValue == 1){
            return 1;
        }

        for(int third_value = 3; third_value<=userValue;third_value++){
            int number_of_ways = first_value+second_value;
            first_value = second_value;
            second_value = number_of_ways;
        }
        return second_value;
    }
}
