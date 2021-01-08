/**
 * 
 * @author Andreas ox object is the object that exists on tic tac toe table. The
 *         symbol will be 'o','x' or 'n' for null.
 */
public class ox {
	public char symbol;

	/**
	 * Constructor
	 * 
	 * @param symbol
	 *            symbol of the new object
	 */
	public ox(char symbol) {
		this.symbol = symbol;

	}

	/**
	 * Checks whether the object is occupied or null
	 * 
	 * @return whether the object is occupied or it has 'x' or 'o'
	 */
	public boolean isOccupied() {

		if (this.symbol != 'n') {

			return true;
		}
		return false;
	}

}
