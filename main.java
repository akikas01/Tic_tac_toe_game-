import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		System.out.println("Welcome to tic tac toe game!!!");
		table board = new table(); // Creates a new table
		boolean playero = true; // Determinates if player O is playing and
								// initialise to true
		System.out.println(board.toString());// Show the table
		while (board.checkWin() == null && !board.isFull()) {// Checking if a
																// player has
																// won and if
																// the table is
																// full
			String player;

			if (playero) { // If player O is playing the String player
							// initialises to O
				player = "O";

			} else {
				player = "X";
			}
			System.out.println("Player " + player + " turn");
			int x;
			int y;
			do { // Asks the player for coordinates while he puts wrong
					// coordinates or if the coordinate he puts is occupied
				System.out.println("Please give 2 integers that represents the coordinate you want to put " + player
						+ " from 1-3");
				Scanner input = new Scanner(System.in);
				x = input.nextInt();
				y = input.nextInt();
				
			} while ((x > 3 || y > 3 || x < 1 || y < 1) || (board.isOccupied(x, y)));
			
			if (player == "O") { // Inserts 'x' or 'o' into the table according
									// to who is playing
				board.insertIntoTable('o', x, y);
			} else {
				board.insertIntoTable('x', x, y);
			}
			System.out.println(board.toString());
			playero = !playero; // Changes player

		}

		if (board.isFull()) { // If board is full or someone won it shows the
								// apppropriate message
			System.out.println("The table is full!No one wins!!!");
		} else {
			System.out.println("The winner is " + board.checkWin().symbol);
			System.out.println(board.toString());
		}

	}
}
