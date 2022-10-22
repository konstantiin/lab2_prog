package bin.my_pokemons;
import ru.ifmo.se.pokemon.*;
import bin.my_attacks.*;

public class Bellosom extends Gloom{
	public Bellosom(String name, int lvl){
		super(name, lvl);
		setType(Type.GRASS, Type.POISON);
		setStats(75, 80, 95, 90, 100, 50);
		addMove(new PetalBlizzard());
	}
}