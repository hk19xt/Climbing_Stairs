package Climbing_Stairs;

/*This class is the main class. The user can change the input values in the hardcoded line.
After compiling this program, the output will be seen in the console. 
Author: Hyejin Kim
Date: 9/26/2021 */

public class Main {
    public static void main(String[] args){
        Climbing c = new Climbing();
        int userValue = 5; //The users can change the input value here.
        int output=0; //Initialize the output value.
        output = c.climbing(userValue);
        System.out.println(output);
    }
}//Main
