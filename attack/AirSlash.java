package bin.my_attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class AirSlash extends SpecialMove{
	double chance = 0.3;
	public AirSlash() {
		super(Type.FLYING, 75, 0.95);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		if (Math.random() <= chance) {
			Effect.flinch(p);
			System.out.println(p.toString() + " испугался.");
		}
	}
	@Override
	protected String describe(){
		return "применил Air Slash";
	}
}
