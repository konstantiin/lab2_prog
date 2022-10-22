package bin.my_pokemons;
import ru.ifmo.se.pokemon.*;
import bin.my_attacks.*;

public class Ledyba extends Pokemon{
	public Ledyba(String name, int lvl){
		super(name, lvl);
		setType(Type.BUG, Type.FLYING);
		setStats(40, 20, 30, 40, 80, 55);
		addMove(new Roost());
		addMove(new Confide());
		addMove(new AirSlash());
	}
}
