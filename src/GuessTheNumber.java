import  java.util.Scanner;
import java.util.Random;

class Game{
    public int ComputerInput  , UserGuess  ,  no_of_guess =0;

       public Game(){
        Random random = new Random();
        ComputerInput = random.nextInt(100);
    }
       public void UserInput(int num){
        UserGuess = num;
    }
    public boolean IsCorrectNumber(){
        if(UserGuess > ComputerInput){
            System.out.println("You have chosen Bigger No choose smaller than "+UserGuess);
            no_of_guess = no_of_guess + 1;
            return false;
        }
        else  if(UserGuess < ComputerInput){
            System.out.println("You have Chosen Smaller number choose bigger than "+ UserGuess);
            no_of_guess = no_of_guess + 1;
            return  false;
        }
        else {
            System.out.println("Your Guess is Correct");
            no_of_guess = no_of_guess + 1;
            if(no_of_guess<=5){
                System.out.println("wow you took fewer guesses your guesses "+no_of_guess);
            }
            else if(no_of_guess>=5 && no_of_guess<=10){
                System.out.println("wow you took ok number guesses your guesses "+no_of_guess);
            }else {
                System.out.println("wow you took higher number of guesses your guesses "+no_of_guess);
            }
            return true;
        }
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO GUESS THE NUMBER GAME ! ");

        Game player = new Game();

        System.out.println("Guess the Number from 0 to 100: ");
        player.UserInput(sc.nextInt());

        while(!player.IsCorrectNumber()){
            System.out.println("Guess the Number Again");
            player.UserInput(sc.nextInt());
        }
    }
}