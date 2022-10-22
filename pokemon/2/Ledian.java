package bin.my_pokemons;
import ru.ifmo.se.pokemon.*;
import bin.my_attacks.*;


public class Ledian extends Ledyba{
	public Ledian(String name, int lvl){
		super(name, lvl);
		setType(Type.BUG, Type.FLYING);
		setStats(55, 35, 50, 55, 110, 85);
		addMove(new FocusBlast());
	}
}