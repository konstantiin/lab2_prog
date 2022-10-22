package bin.my_attacks;
import ru.ifmo.se.pokemon.*;

public class Spark extends PhysicalMove{
	Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
	public Spark() {
		super(Type.ELECTRIC, 65, 1);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		p.setCondition(e);
	}
	@Override
	protected String describe(){
		return "применил Spark";
	}
}

