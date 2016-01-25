/*
 * Jacob Ng
 * APCS
 */
class GolfScoreCardExecute{
    public static void main(String[] args){
        GolfScoreCard play = new GolfScoreCard();
        for(int i=1; i<=4; i++){
            play.getInput();
            play.parseInput();
            play.addScore();
            System.out.print(i+". ");
            play.printName();
        }
        System.out.print("5. ");
        play.printCumulativeName();
    }
}