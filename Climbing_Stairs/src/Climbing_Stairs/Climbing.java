package Climbing_Stairs;

/*This class is the implementation class. The input value is inserted by users in the main class.
The algorithm has base case, when the value is 0 and 1, and it calculates as a Fibonacci recursive function.*/

public class Climbing {
    public int climbing(int userValue){

        int first_value = 1;
        int second_value = 2;

        if(userValue == 0){ //Base case 1: when the input value is zero, then return 1 since there is only one way to climb the stairs..
            return 1;
        }
        if(userValue == 1){ //Base case 2: when the input value is one, then return 1 as the same reason above.
            return 1;
        }

        for(int third_value = 3; third_value<=userValue;third_value++){ //If the input value is over three, then we can calculate the number of ways using Fibonacci function.
            
            //For example, when there are four stairs, then we have three ways to climb : (1, 1, 1), (1, 2), (2, 1)
            //When there are five stairs, then we have five ways to climb : (1, 1, 1, 1, 1), (1, 2, 2), (1, 1, 1, 2), (2, 2, 1), (2, 1, 2)
            //Likewise, when there are five stairs, then we have 5 ways to climb. 
            //As a result, this is the Fibonacci as you can see: 1, 1, 2, 3, 5, 8, 13 ...
  
            int number_of_ways = first_value+second_value;
            first_value = second_value;
            second_value = number_of_ways;
        }
        return second_value;
    }
}//Climbing
