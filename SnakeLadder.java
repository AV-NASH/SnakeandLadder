package snakeladderpackage;

import java.util.Scanner;

public class SnakeLadder {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	int start_position=0;
	int position;
	int dice_roll;
	
	 final int ladder=1;
	 final int snake=2;
	 
	System.out.println("wlecome to the snake n ladder game\n");
	position=start_position;
	
	System.out.println("Your starting position is:"+position);
	
	System.out.println("Press enter to roll the  dice");
	sc.nextLine();
	dice_roll=(int)((Math.random()*10)%6+1);
	System.out.println("Dice shows "+dice_roll);
	
	int play_check=(int)((Math.random()*10)%3);
	
	switch (play_check) {
		case ladder: {
			System.out.println("you encountered a ladder");	
			position =position+dice_roll;
		}
		
		case snake: {
			System.out.println("you encountered a snake");	
			position=position-dice_roll;
		}
		default:
			System.out.println("you encountered no play, please roll dice again");
		}
	
	
	System.out.println("Your new position is:"+position);
	
	
}
}

