package bin.my_pokemons;
import ru.ifmo.se.pokemon.*;
import bin.my_attacks.*;

public class Minun extends Pokemon{
	// min 7 lvl
	public Minun(String name, int lvl){
		super(name, lvl);
		setType(Type.ELECTRIC);
		setStats(60, 40, 50, 75, 85, 95);
		addMove(new Spark());
		addMove(new Nuzzle());
		addMove(new Sing());
		addMove(new Growl());
	}
}