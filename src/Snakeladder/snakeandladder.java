package Snakeladder;

import java.util.Random;t

public class snakeandladder {
    final static int PLAYER_A_POSITION = 0;

    public static void main(String[] args) {
        System.out.println("welcome to snake and ladder program");
        System.out.println("starting position of the player is :" + PLAYER_A_POSITION);
        Random dice = new Random();
        int DiceDispaly = dice.nextInt(6) + 1;
        System.out.println("numbers display on the dice is:" + DiceDispaly);
    }
}

