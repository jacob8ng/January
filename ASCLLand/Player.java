/*
 * Jacob Ng
 * APCS
 * Player Object for ASCLLand
 */
class Player{
    int position=0;
    void movePlayer(int diceRoll){
        if(diceRoll==4||diceRoll==6){
            position-=diceRoll;
        }else{
            position+=diceRoll;
        }
    }
    int position(){
        return position;
    }
    void returnStart(){
       position=0;
    }
}