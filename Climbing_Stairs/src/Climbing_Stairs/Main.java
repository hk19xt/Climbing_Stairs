package Climbing_Stairs;

public class Main {
    public static void main(String[] args){
        Climbing c = new Climbing();
        int userValue = 5;
        int output=0;
        output = c.climbing(userValue);
        System.out.println(output);
    }
}
