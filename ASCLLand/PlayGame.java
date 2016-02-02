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
            System.out.println(playGame(input, i));
        }
    }
    public static String playGame(String input, int i){
        Player playerA = new Player();
        Player playerB = new Player();
        int count = 9;
        String moves = input.substring(count);
        while(moves.length()>4){
            playerA.movePlayer(Integer.parseInt(moves.substring(0,1)));
            if(playerA.position()==playerB.position()){
                playerB.returnStart();
            }
            playerB.movePlayer(Integer.parseInt(moves.substring(2,3)));
            if(playerA.position()==playerB.position()){
                playerA.returnStart();
            }
            count+=4;
            moves = input.substring(count);
        }
        return "Output #"+i+": A-"+playerA.position()+", B-"+playerB.position();
    }
}