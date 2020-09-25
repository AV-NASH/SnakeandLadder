package snakeladderpackage;

import java.util.Scanner;

public class SnakeLadder {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	int start_position=0;
	int position;
	int dice_roll;
	 
	System.out.println("wlecome to the snake n ladder game\n");
	position=start_position;
	
	System.out.println("Press enter to roll the  dice");
	sc.nextLine();
	dice_roll=(int)((Math.random()*10)%6+1);
	System.out.println("Dice shows up "+dice_roll);
	System.out.println("Your starting position is:"+position);
	
	
}
}

