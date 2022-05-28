import java.util.Random;
import java.util.Scanner;

public class Game {
   public int num , inputNum;
   public int noOfGuesses =0;

    void input(){
        System.out.println("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
        noOfGuesses ++;
    }

    Game(){
        Random rand = new Random();
        this.num = rand.nextInt(100);
    }

    boolean check(){
        if(num == inputNum){
            System.out.println("You have guessed correctly in "+noOfGuesses+" attempts");
            return true;
        }
        else if(num > inputNum){
            System.out.println("Too small");
        }else if(num < inputNum){
            System.out.println("Too high");
        }
        return false;
    }

    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.input();
            g.check();
        }
    }
}
