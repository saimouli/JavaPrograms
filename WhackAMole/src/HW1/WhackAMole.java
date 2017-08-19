package HW1;

import java.util.*;

public class WhackAMole {
	// instances
	int score;
	int molesLeft;
	int attemptsLeft;
	char [][] moleGrid;

	//methods
	
	//constructor
	WhackAMole(int numAttempts, int gridDimension) {
		moleGrid= new char [gridDimension][gridDimension];
		attemptsLeft= numAttempts;
		
		for (int y = 0; y < gridDimension; y++) {
			for (int x = 0; x < gridDimension; x++) {
				moleGrid[y][x] = '*';
			}
		}
		
	}

	boolean place(int x, int y) {
		if (moleGrid[x][y] == '*') {
			moleGrid[x][y]='M'; //place moles
			molesLeft= molesLeft+1;
			return true;
		}
		else {
			return false;
		}
			
	}

	void whack(int x,int y) {
				
		if (moleGrid [x] [y] == 'M') {
			
			moleGrid [x] [y] = 'W';
			molesLeft= molesLeft -1; //initial molesleft=0
			System.out.println("molesleft"+ molesLeft);
			attemptsLeft= attemptsLeft-1;
			score= score+1;
			
			printGridToUser();
			
		}
		else {
			attemptsLeft= attemptsLeft-1;
		}

	}

	void printGridToUser() {
		for (int y = 0; y < moleGrid.length; y++) {
			for (int x = 0; x < moleGrid.length; x++) {
				
				if( moleGrid [y] [x] == 'W') {
					System.out.print('W');
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

	void printGrid() {
		for (int y = 0; y < moleGrid.length; y++) {
			for (int x = 0; x < moleGrid.length; x++) {
				System.out.print(moleGrid[y][x]);
				
			}			
			System.out.println();
		}
	}
}


	

