package bin.my_pokemons;
import ru.ifmo.se.pokemon.*;
import bin.my_attacks.*;


public class Oddish extends Pokemon{
	public Oddish(String name, int lvl){
		super(name, lvl);
		setType(Type.GRASS, Type.POISON);
		setStats(45, 50, 55, 75, 65, 30);
		addMove(new SludgeBomb());
		addMove(new Rest());
	}
}