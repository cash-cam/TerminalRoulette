import java.util.random.*;
import java.util.HashMap;

public class Roulette {
	private static HashMap<Integer, String> board = new HashMap<>();

	public Roulette() {
		board.put(0, "Green");
		for (int i = 1; i <= 36; i++) {
			if (i % 2 == 0) {
				board.put(i, "Black");
			}
			board.put(i, "Red");
		}
	}

	

}
