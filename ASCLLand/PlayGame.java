/*
 * Jacob Ng
 * APCS
 * Client Code for ASCLLand
 */
import java.util.*;
class PlayGame{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            System.out.println("What is line "+i+"?");
            String input = userInput.nextLine();
            playGame(input);
        }
    }
    public static void playGame(String input){
        Player playerA = new Player();
        Player playerB = new Player();
        moves = input.substring(9,input.length());
        int count = 0;
        while(count!=moves.length()){
            