package bin.my_pokemons;
import ru.ifmo.se.pokemon.*;
import bin.my_attacks.*;

public class Gloom extends Oddish{
	public Gloom(String name, int lvl){
		super(name, lvl);
		setType(Type.GRASS, Type.POISON);
		setStats(60, 65, 70, 85, 75, 40);
		addMove(new Growth());
	}
}