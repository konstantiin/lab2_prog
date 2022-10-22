package bin.my_attacks;
import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove{
	Effect e = new Effect().chance(0.3).condition(Status.POISON);
	public SludgeBomb() {
		super(Type.POISON, 90, 1);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		p.addEffect(e);
	}
	@Override
	protected String describe(){
		return "применил Sludge Bomb";
	}
}
