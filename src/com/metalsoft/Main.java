package com.metalsoft;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        int blackjacknum =21;
        int max =10;
        int min=1;
        int random_int = (int )(Math.random() * max + min);



        Scanner sc = new Scanner(System.in);

        System.out.println("Your number is " + random_int + " do you want to quit?");


        int playerNum = random_int;


        do {
            int maxx =10;
            int minn=1;
            int random_intt = (int)(Math.random() * max + min);



            playerNum = playerNum + random_intt;
            String playerANSWER = sc.nextLine();
            if (playerANSWER.equals("y")) {

                System.out.println("You left game");
                CalculateWinChance();
                break;
            }
            else if (playerNum == 21) {
                System.out.println("YOU WON CONGRATS");
            }

            else if (playerNum > 21) {
                System.out.println("Game over. Limit off");
            }


            else if (playerNum < 21 ) {

                System.out.println("your new number is " + random_intt + " do you want to quit");
            }


        } while (blackjacknum != playerNum);


    }

    //Calculate winning chance
    // 1 or 11 issue
    public static int  CalculateWinChance (int playerNum)  {


        System.out.println("Your chance of winning was");
    }

}