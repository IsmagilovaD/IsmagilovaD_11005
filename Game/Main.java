package Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello!(｡◕‿‿◕｡) \nWhat is your name?");
        String name1 = in.nextLine();
        System.out.println("Beautiful name!(｡─‿‿─｡)\nOh, What's your name?");
        String name2 = in.nextLine();
        Player player1 = new Player(name1, 10);
        Player player2 = new Player(name2, 10);

        Game game = new Game(player1, player2);

        System.out.println();
        player1.display();
        player2.display();

        game.game(player1,player2);


    }
}
