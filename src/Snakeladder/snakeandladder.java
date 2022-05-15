package Snakeladder;

import java.util.Random;

public class snakeandladder {
    final static int PLAYER_A_POSITION = 0;

    public static void main(String[] args) {
        int x = 0;
        System.out.println("welcome to snake and ladder program");
        System.out.println("starting position of the player is :" + PLAYER_A_POSITION);
        Random dice = new Random();
        int DiceDispaly = dice.nextInt(6) + 1;
        System.out.println("numbers display on the dice is:" + DiceDispaly);
        Random check = new Random();
        int PlayerAstatus = check.nextInt(3);
        switch (PlayerAstatus) {
            case 0:
                System.out.println("current  position remains same:" + x);

                break;
            case 1:
                x = x + DiceDispaly;

                System.out.println("current player position is:" + x);
                break;
            default:
                x = x - DiceDispaly;
                System.out.println("current position is:" + x);
                break;
        }
    }
}

