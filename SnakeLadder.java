package snakeladderpackage;

import java.util.Scanner;

public class SnakeLadder {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	int start_position=0;
	int winning_position=100;
	int play_check;
	int position1,position2;
	int dice_roll;
	int noof_dice_roll=0;
	
	 final int ladder=1;
	 final int snake=2;
	 
	System.out.println("welcome to the snake n ladder game\n");
	position1=start_position;
	position2=start_position;
	
	System.out.println("Both players starting position is:"+start_position);
	
	
	do {
		
		do {
		System.out.println("player 1 press enter to roll the  dice");
		sc.nextLine();
		dice_roll=(int)((Math.random()*10)%6+1);
		noof_dice_roll++;
		System.out.println("Dice shows "+dice_roll);
		play_check=(int)((Math.random()*10)%3);
		
		if(!((position1+dice_roll)>100)) {
	
		switch (play_check) {
			case ladder: {
				System.out.println("you encountered a ladder");	
				position1 =position1+dice_roll;
				break;
			}
			
			case snake: {
				System.out.println("you encountered a snake");	
				position1=position1-dice_roll;
				break;
			}
			default:
				System.out.println("you encountered no play");
			}
		}  else System.out.println("Cannot go beyond 100");
		
		
		
		if(position1<0) position1=start_position;
		System.out.println("player 1's new position is:"+position1+"\n");
		} while(play_check==ladder);
		
		do {
		System.out.println("player 2 press enter to roll the  dice");
		sc.nextLine();
		dice_roll=(int)((Math.random()*10)%6+1);
		noof_dice_roll++;
		System.out.println("Dice shows "+dice_roll);
		play_check=(int)((Math.random()*10)%3);
		
		if(!((position2+dice_roll)>100)) {
	
		switch (play_check) {
			case ladder: {
				System.out.println("you encountered a ladder");	
				position2 =position2+dice_roll;
				break;
			}
			
			case snake: {
				System.out.println("you encountered a snake");	
				position2=position2-dice_roll;
				break;
			}
			default:
				System.out.println("you encountered no play");
			}
		}  else System.out.println("Cannot go beyond 100");
		
		
		
		if(position2<0) position2=start_position;
		System.out.println("player 2's new position is:"+position2+"\n");
		}while(play_check==ladder);
		
		
	} while(position1<winning_position || position2<winning_position);
	
	
	if(position1==winning_position)
	System.out.println("Congratulations player 1 has won the game");
	else
		System.out.println("Congratulations player 2 has won the game");
	System.out.println("Dice was rolled "+noof_dice_roll+" times throughout the game");
	
	
}
}

