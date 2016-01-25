/*
 *Jacob Ng
 *APCS
 */
import java.util.*;
class GolfScoreCard{
    int cumulativeScore=0;
    int cumulativePar=0;
    int score;
    int par;
    int holeNumber;
    String input;
    void getInput(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter input: <hole #>. <par> <score>");
        input = userInput.nextLine();
    }
    void addScore(){
        cumulativeScore+=score;
        cumulativePar+=par;
    }
    void printName(){
        if(score==par){
            System.out.println("par");
        }else if(score-1==par){
            System.out.println("bogey");
        }else if(score-2==par){
            System.out.println("double bogey");
        }else if(score+1==par){
            System.out.println("birdie");
        }else if(score+2==par){
            System.out.println("eagle");
        }else if(score>par){
            System.out.println(score-par+" above par");
        }else{
            System.out.println(par-score+" below par");
        }
    }
    void printCumulativeName(){
        if(cumulativeScore==cumulativePar){
            System.out.println("par");
        }else if(cumulativeScore>cumulativePar){
            System.out.println(cumulativeScore-cumulativePar+" over par");
        }else{
            System.out.println(cumulativePar-cumulativeScore+" under par");
        }
    }
    void parseInput(){
        par=Integer.valueOf(input.substring(3,4));
        score=Integer.valueOf(input.substring(5,6));
    }
}