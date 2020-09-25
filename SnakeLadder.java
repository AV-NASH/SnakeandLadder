package snakeladderpackage;

import java.util.Scanner;

public class SnakeLadder {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	int start_position=0;
	int winning_position=100;
	int play_check;
	int position;
	int dice_roll;
	
	 final int ladder=1;
	 final int snake=2;
	 
	System.out.println("wlecome to the snake n ladder game\n");
	position=start_position;
	
	System.out.println("Your starting position is:"+position);
	while(position<winning_position) {
	System.out.println("Press enter to roll the  dice");
	sc.nextLine();
	dice_roll=(int)((Math.random()*10)%6+1);
	System.out.println("Dice shows "+dice_roll);
	play_check=(int)((Math.random()*10)%3);
	
	if(!((position+dice_roll)>100)) {

	switch (play_check) {
		case ladder: {
			System.out.println("you encountered a ladder");	
			position =position+dice_roll;
			break;
		}
		
		case snake: {
			System.out.println("you encountered a snake");	
			position=position-dice_roll;
			break;
		}
		default:
			System.out.println("you encountered no play, please roll dice again");
		}
	}  else System.out.println("Cannot go beyond 100 please roll the dice again");
	
	
	
	if(position<0) position=start_position;
	System.out.println("Your new position is:"+position);
	
	}
	
	System.out.println("Congratulations you have won the game");
	
	
}
}

