package Game;

import java.util.Scanner;

public class Game {

    Scanner in = new Scanner(System.in);
    public int powerOfHit;
    public Player player1;
    public Player player2;

   public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

     int round = 1;
    public void game(Player player1, Player player2){
        System.out.println("Lets Start! (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ ✧ﾟ･: *ヽ(◕ヮ◕ヽ)");
        while (player1.getHp()>0 & player2.getHp()>0){
            System.out.println("\n ROUND "+ round + "  ----------------------- ");

            System.out.println("Show your power, " + player1.getName());
           powerOfHit = in.nextInt();
            yourGame(powerOfHit, player2);
            if (player2.getHp() <= 0){
                break;
            }

            System.out.println("Now you, " + player2.getName());
            powerOfHit = in.nextInt();
            yourGame(powerOfHit, player1);

            round ++;
        }
        System.out.println("*:･ﾟ✧*:･ﾟ✧*:･ﾟ✧*:･ﾟ✧*:･ﾟ✧*:･ﾟ✧*:･ﾟ✧*:･ﾟ✧*:･ﾟ✧");

        if (player1.getHp() <= 0){
            System.out.println("Good job, " + player2.getName() + " (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧");
        } else {
            System.out.println("Nice! " + player1.getName() + " ヽ(> ∀ <☆)ノ");
        }
    }

    public void yourGame(int powerOfHit, Player anotherPlayer) {
        double a = Math.random() * 100;
        if (powerOfHit > 0 && powerOfHit <10) {
            if (a < 100 / powerOfHit) {
                anotherPlayer.hitHp(powerOfHit);
                System.out.println("GREAT! \\(＾▽＾)/ You get " + powerOfHit +"! Your rival now is");
                anotherPlayer.display();
            } else {
                System.out.println("Oh no! You missed... （ಥ﹏ಥ）");
            }
        }

    }
}