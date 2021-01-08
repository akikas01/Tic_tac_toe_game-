
/**
 * @author Andreas
 *
 *         table variable represents the table with o or x marks
 */

public class table {
	public ox table[][];

	/**
	 * Constructor. It sets the table to all ox object to null or 'n'.
	 */
	public table() {
		table = new ox[3][3];
		for (int i = 0; i < table.length; i++) {
			for (int x = 0; x < table[0].length; x++) {
				table[i][x] = new ox('n');
			}
		}

	}

	/**
	 * Determinates if a coordinate is occupied
	 * 
	 * @param x
	 *            coordinate x
	 * @param y
	 *            coordinate y
	 * @return Whether the coordinate at the specific x and y given is occupied
	 *         or not
	 */
	public boolean isOccupied(int x, int y) {

		if (table[x - 1][y - 1].isOccupied()) {
			System.out.println("The position you entered is occupied.");
			return true;
		}
		return false;

	}

	/**
	 * Insert given coordinate into table
	 * 
	 * @param symbol
	 *            symbol that will be inserted into table (o or x)
	 * @param x
	 *            coordinate x
	 * @param y
	 *            coordinate y
	 */
	public void insertIntoTable(char symbol, int x, int y) {
		this.table[x - 1][y - 1] = new ox(symbol);
	}

	/**
	 * Checks if a player has won the game.
	 * 
	 * @return ox object with the symbol that won the game.
	 */
	public ox checkWin() {
		for (int i = 0; i < table.length; i++) {
			if (table[i][0].symbol == 'x' && table[i][1].symbol == 'x' && table[i][2].symbol == 'x'
					|| table[i][0].symbol == 'o' && table[i][1].symbol == 'o' && table[i][2].symbol == 'o') {
				return table[i][0];

			}
			if (table[0][i].symbol == 'o' && table[1][i].symbol == 'o' && table[2][i].symbol == 'o'
					|| table[0][i].symbol == 'x' && table[1][i].symbol == 'x' && table[2][i].symbol == 'x') {
				return table[0][i];

			}
		}
		if (table[0][0].symbol == 'o' && table[1][1].symbol == 'o' && table[2][2].symbol == 'o'
				|| table[0][0].symbol == 'x' && table[1][1].symbol == 'x' && table[2][2].symbol == 'x') {
			return table[0][0];
		}

		if (table[0][2].symbol == 'o' && table[1][1].symbol == 'o' && table[2][0].symbol == 'o'
				|| table[0][2].symbol == 'x' && table[1][1].symbol == 'x' && table[2][0].symbol == 'x') {
			return table[0][2];
		}

		return null;

	}

	/**
	 * Checks whether table is full.
	 * 
	 * @return whether table is full.
	 */
	public boolean isFull() {

		for (int i = 0; i < table.length; i++) {
			for (int x = 0; x < table.length; x++) {
				if (!table[i][x].isOccupied()) {
					return false;
				}

			}

		}
		return true;
	}

	/**
	 * @return The current display of the table.
	 */
	public String toString() {
		String output = "  1    2    3  ";
		for (int i = 0; i < table.length; i++) {
			output = output + "\n";
			output = output + (i + 1) + "|";
			for (int x = 0; x < table[0].length; x++) {
				if (table[i][x].symbol == 'n') {
					output = output + "   |";
				} else if (table[i][x].symbol == 'x') {
					output = output + " X |";

				} else if (table[i][x].symbol == 'o') {
					output = output + " O |";

				}

			}

		}

		return output;
	}

}
