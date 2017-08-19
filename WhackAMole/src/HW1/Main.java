package HW1;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		int x;
		int y;
		Random rand = new Random();
			
		WhackAMole mygame= new WhackAMole(5,10);
		
		int counter = 0;
		while(counter !=10) {
			int molex = rand.nextInt(mygame.moleGrid.length) +0; // max is the mole grid and min is 1
			int moley = rand.nextInt(mygame.moleGrid.length) +0;
			//System.out.println("x"+molex);
			//System.out.println("y"+moley);
			
			
			if (mygame.place(molex,moley) == true) {
				mygame.place(molex,moley);
				counter = counter + 1;
			}
		}
		
		String line;
		String [] cordinatesVector;
		
		Scanner dis = new Scanner(System.in); //declare scanner
		
		while (mygame.attemptsLeft!=0) {
			System.out.println("You have "+ mygame.attemptsLeft + " attempts left");
			System.out.print("Enter x and y coordinates for mole wacking with a comma: ");
			
			line = dis.nextLine(); //reads 1,2,3
			cordinatesVector = line.split(",");
			
			x= Integer.parseInt(cordinatesVector[0]);
			y= Integer.parseInt(cordinatesVector[1]);
			
			if (x == -1 || y == -1) {
				mygame.attemptsLeft=0;
				System.out.println("Thanks For playing the game.");
				mygame.printGrid();
			}
			else {
				mygame.whack(x, y);
			}
		}
		
		System.out.println("Thanks For playing the game.");
		mygame.printGrid();	
		
	}
}
